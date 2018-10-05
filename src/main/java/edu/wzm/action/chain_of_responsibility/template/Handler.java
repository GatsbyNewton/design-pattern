package edu.wzm.action.chain_of_responsibility.template;

public interface Handler {

    void setSuccessor(Handler handler);

    void handleRequest(int request);
}
