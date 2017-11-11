package pl.goszczyn.leadservice.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.goszczyn.leadservice.model.Agent;

@Component
public class AgentRestTemplateClient {

    @Autowired
    RestTemplate restTemplate;

    private static final Logger logger = LoggerFactory.getLogger(AgentRestTemplateClient.class);

    public Agent getAgent(String agentNo){
        ResponseEntity<Agent> restExchange =
                restTemplate.exchange(
                        "http://zuulservice:5555/agentservice/agent/{agentNo}",
                        HttpMethod.GET,
                        null, Agent.class, agentNo);

        return restExchange.getBody();
    }
}
