package pl.goszczyn.agentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.goszczyn.agentservice.model.Agent;
import pl.goszczyn.agentservice.service.impl.AgentService;

@RestController
public class AgentController {

    @Autowired
    private AgentService agentService;

    @RequestMapping(value = "/agent/{agentNo}", method = RequestMethod.GET)
    public Agent getAgent(@PathVariable("agentNo") String agentNo) {
        return agentService.findAgentByAgentNo(agentNo);
    }
}