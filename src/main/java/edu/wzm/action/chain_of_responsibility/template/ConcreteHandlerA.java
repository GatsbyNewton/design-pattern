package edu.wzm.action.chain_of_responsibility.template;

import java.util.Objects;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setSuccessor(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(int request) {
        if (request > 0 && request < 10){
            System.out.println(ConcreteHandlerA.class.getName() + " 已处理。");
        }else if (!Objects.equals(nextHandler, null)){
            nextHandler.handleRequest(request);
        }
    }
}
