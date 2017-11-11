package pl.goszczyn.agentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.goszczyn.agentservice.config.ServiceConfig;
import pl.goszczyn.agentservice.model.Agent;
import pl.goszczyn.agentservice.repository.AgentRepository;
import pl.goszczyn.agentservice.service.impl.AgentService;

@Service
public class AgentServiceImpl implements AgentService {

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    ServiceConfig config;

    @Override
    public Agent findAgentByAgentNo(String agentNo) {
        return agentRepository.findByAgentNo(agentNo);
    }
}
