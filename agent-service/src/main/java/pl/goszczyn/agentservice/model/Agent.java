package pl.goszczyn.agentservice.model;


import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(schema = "agent_schema", name = "Agent")
public class Agent {

    @Id
    @SequenceGenerator(schema = "agent_schema", name = "agent_id_seq")
    @Column(name = "id", nullable = false)
    private BigInteger id;

    @Column(name = "agentNo", nullable = false)
    private String agentNo;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "surname", nullable = false)
    private String surname;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
