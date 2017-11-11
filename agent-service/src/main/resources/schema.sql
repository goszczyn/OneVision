DROP SEQUENCE  IF EXISTS  agent_schema.agent_id_seq;

DROP TABLE IF EXISTS agent_schema.Agent;

DROP SCHEMA IF EXISTS agent_schema;

CREATE  SCHEMA agent_schema;

CREATE TABLE agent_schema.Agent (
  id                BIGINT PRIMARY KEY NOT NULL,
  agentNo           TEXT NOT NULL,
  firstName         TEXT NOT NULL,
  surname           TEXT NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS agent_schema.agent_id_seq
INCREMENT BY 1
MINVALUE 1
START WITH 1
NO CYCLE
OWNED BY agent_schema.Agent.id ;

INSERT INTO agent_schema.Agent values (nextval('agent_schema.agent_id_seq'), '12345', 'Bartosz', 'Goszczynski');

select count(*) from agent_schema.Agent;