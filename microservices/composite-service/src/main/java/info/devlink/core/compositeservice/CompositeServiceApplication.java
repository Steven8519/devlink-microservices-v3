package info.devlink.core.compositeservice;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

import static java.util.Collections.emptyList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.SWAGGER_2;


@EnableSwagger2WebFlux
@SpringBootApplication
@ComponentScan("info.devlink.core")
public class CompositeServiceApplication {

	@Value("${api.common.version}")           String apiVersion;
	@Value("${api.common.title}")             String apiTitle;
	@Value("${api.common.description}")       String apiDescription;
	@Value("${api.common.termsOfServiceUrl}") String apiTermsOfServiceUrl;

	@Value("${api.common.license}")           String apiLicense;
	@Value("${api.common.licenseUrl}")        String apiLicenseUrl;
	@Value("${api.common.contact.name}")      String apiContactName;
	@Value("${api.common.contact.url}")       String apiContactUrl;
	@Value("${api.common.contact.email}")     String apiContactEmail;

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * Will exposed on $HOST:$PORT/swagger-ui.html
	 *
	 * @return
	 */

	@Bean
	public Docket api() {

		return new Docket(SWAGGER_2)
				.select()
				.apis(basePackage("info.devlink.core.composite.developer"))
				.paths(PathSelectors.any())
				.build()
				.globalResponseMessage(GET, emptyList())
				.apiInfo(new ApiInfo(
						apiTitle,
						apiDescription,
						apiVersion,
						apiTermsOfServiceUrl,
						new Contact(apiContactName, apiContactUrl, apiContactEmail),
						apiLicense,
						apiLicenseUrl,
						emptyList()
				));
	}

	public static void main(String[] args) {
		SpringApplication.run(CompositeServiceApplication.class, args);
	}

}
