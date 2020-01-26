package info.devlink.core.developerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("info.devlink.core")
public class DeveloperServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DeveloperServiceApplication.class, args);
    }

}
