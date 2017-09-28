package pl.goszczyn.leadservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {

    @Value("${example.password}")
    private String password;

    public String getPassword() {
        return password;
    }
}