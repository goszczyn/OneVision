package pl.goszczyn.agentservice.service.impl;

import pl.goszczyn.agentservice.model.Agent;

public interface AgentService {

    Agent findAgentByAgentNo(String agentNo);
}
