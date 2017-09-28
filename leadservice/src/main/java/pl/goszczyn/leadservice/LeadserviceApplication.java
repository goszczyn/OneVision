package pl.goszczyn.leadservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class LeadserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeadserviceApplication.class, args);
    }
}
