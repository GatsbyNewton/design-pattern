package edu.wzm.action.chain_of_responsibility.template;

public class ConcreteHandlerC implements Handler {
    private Handler nextHandler;

    @Override
    public void setSuccessor(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 50){
            System.out.println(ConcreteHandlerC.class.getName() + " 已处理。");
        }else{
            System.out.println(ConcreteHandlerC.class.getName() + " 处理不了。");
        }
    }
}
