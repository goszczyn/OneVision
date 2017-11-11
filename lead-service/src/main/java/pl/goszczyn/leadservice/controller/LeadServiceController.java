package pl.goszczyn.leadservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.goszczyn.leadservice.clients.AgentRestTemplateClient;
import pl.goszczyn.leadservice.config.ServiceConfig;
import pl.goszczyn.leadservice.model.Agent;

@RestController
public class LeadServiceController {

    @Autowired
    private ServiceConfig config;

    @Autowired
    private AgentRestTemplateClient agentClient;

    @RequestMapping(value="/showPassword",method = RequestMethod.GET)
    public String showPassword() {
        Agent agent = agentClient.getAgent("12345");
        return config.getPassword() + " agent " + agent.getSurname();
    }
}
