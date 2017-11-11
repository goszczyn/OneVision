package pl.goszczyn.leadservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.goszczyn.leadservice.config.ServiceConfig;

@RestController
public class LeadServiceController {

    @Autowired
    private ServiceConfig config;

    @RequestMapping(value="/showPassword",method = RequestMethod.GET)
    public String showPassword() {
        return config.getPassword();
    }
}
