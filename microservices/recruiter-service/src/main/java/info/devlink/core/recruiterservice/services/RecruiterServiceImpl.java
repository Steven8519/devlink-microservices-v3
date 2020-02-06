package info.devlink.core.recruiterservice.services;

import info.devlink.core.api.core.recruiter.Recruiter;
import info.devlink.core.api.core.recruiter.RecruiterService;
import info.devlink.core.recruiterservice.persistence.RecruiterRepository;
import info.devlink.core.util.http.ServiceUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RecruiterServiceImpl implements RecruiterService {

    private static final Logger LOG = LoggerFactory.getLogger(RecruiterServiceImpl.class);

    private final RecruiterRepository repository;

    private final RecruiterMapper mapper;

    private final ServiceUtil serviceUtil;

    @Override
    public Recruiter createRecruiter(Recruiter body) {
        return null;
    }

    @Override
    public List<Recruiter> getRecruiter(int recruiterId) {
        return null;
    }

    @Override
    public void deleteRecruiters(int recruiterId) {

    }
}
