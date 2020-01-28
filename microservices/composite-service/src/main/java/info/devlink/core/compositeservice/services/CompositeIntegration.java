package info.devlink.core.compositeservice.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import info.devlink.core.api.core.contact.Contact;
import info.devlink.core.api.core.contact.ContactService;
import info.devlink.core.api.core.developer.Developer;
import info.devlink.core.api.core.developer.DeveloperService;
import info.devlink.core.api.core.recruiter.Recruiter;
import info.devlink.core.api.core.recruiter.RecruiterService;
import info.devlink.core.util.exceptions.InvalidInputException;
import info.devlink.core.util.exceptions.NotFoundException;
import info.devlink.core.util.http.HttpErrorInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpMethod.GET;

@Component
public class CompositeIntegration implements DeveloperService, RecruiterService, ContactService {

    private static final Logger LOG = LoggerFactory.getLogger(CompositeIntegration.class);

    private final RestTemplate restTemplate;
    private final ObjectMapper mapper;

    private final String developerServiceUrl;
    private final String recruiterServiceUrl;
    private final String contactServiceUrl;

    @Autowired
    public CompositeIntegration(
            RestTemplate restTemplate,
            ObjectMapper mapper,

            @Value("${app.developer-service.host}") String developerServiceHost,
            @Value("${app.developer-service.port}") int    developerServicePort,

            @Value("${app.recruiter-service.host}") String recruiterServiceHost,
            @Value("${app.recruiter-service.port}") int    recruiterServicePort,

            @Value("${app.contact-service.host}") String contactServiceHost,
            @Value("${app.contact-service.port}") int    contactServicePort
    ) {

        this.restTemplate = restTemplate;
        this.mapper = mapper;

        developerServiceUrl = "http://" + developerServiceHost + ":" + developerServicePort + "/developer/";
        recruiterServiceUrl = "http://" + recruiterServiceHost + ":" + recruiterServicePort + "/recruiter?developerId=";
        contactServiceUrl = "http://" + contactServiceHost + ":" + contactServicePort + "/contact?developerId=";

    }

    @Override
    public List<Contact> getContacts(int developerId) {
        try {
            String url = contactServiceUrl + developerId;

            LOG.debug("Will call getReviews API on URL: {}", url);
            List<Contact> contacts = restTemplate.exchange(url, GET, null, new ParameterizedTypeReference<List<Contact>>() {}).getBody();

            LOG.debug("Found {} reviews for a product with id: {}", contacts.size(), developerId);
            return contacts;

        } catch (Exception ex) {
            LOG.warn("Got an exception while requesting reviews, return zero reviews: {}", ex.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public Developer getDeveloper(int developerId) {
        try {
            String url = developerServiceUrl + developerId;
            LOG.debug("Will call getProduct API on URL: {}", url);

            Developer developer = restTemplate.getForObject(url, Developer.class);
            assert developer != null;
            LOG.debug("Found a product with id: {}", developer.getDeveloperId());

            return developer;

        } catch (HttpClientErrorException ex) {

            switch (ex.getStatusCode()) {

                case NOT_FOUND:
                    throw new NotFoundException(getErrorMessage(ex));

                case UNPROCESSABLE_ENTITY :
                    throw new InvalidInputException(getErrorMessage(ex));

                default:
                    LOG.warn("Got a unexpected HTTP error: {}, will rethrow it", ex.getStatusCode());
                    LOG.warn("Error body: {}", ex.getResponseBodyAsString());
                    throw ex;
            }
        }
    }

    private String getErrorMessage(HttpClientErrorException ex) {
        try {
            return mapper.readValue(ex.getResponseBodyAsString(), HttpErrorInfo.class).getMessage();
        } catch (IOException ioex) {
            return ex.getMessage();
        }
    }

    @Override
    public List<Recruiter> getRecruiters(int developerId) {
        try {
            String url = recruiterServiceUrl + developerId;

            LOG.debug("Will call getRecommendations API on URL: {}", url);
            List<Recruiter> recruiters = restTemplate.exchange(url, GET, null, new ParameterizedTypeReference<List<Recruiter>>() {}).getBody();

            assert recruiters != null;
            LOG.debug("Found {} recommendations for a product with id: {}", recruiters.size(), developerId);
            return recruiters;

        } catch (Exception ex) {
            LOG.warn("Got an exception while requesting recommendations, return zero recommendations: {}", ex.getMessage());
            return new ArrayList<>();
        }
    }
}
