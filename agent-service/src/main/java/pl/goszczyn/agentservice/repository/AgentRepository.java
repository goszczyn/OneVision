package pl.goszczyn.agentservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.goszczyn.agentservice.model.Agent;

import java.math.BigInteger;

@Repository
public interface AgentRepository extends CrudRepository<Agent, BigInteger> {

    public Agent findByAgentNo(String agentNo);

}
