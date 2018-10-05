package edu.wzm.action.chain_of_responsibility.example;

public interface Manager {

    void setSuccessor(Manager manager);

    void handleRequest(Request request);
}
