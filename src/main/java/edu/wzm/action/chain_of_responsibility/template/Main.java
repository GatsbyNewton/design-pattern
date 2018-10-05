package edu.wzm.action.chain_of_responsibility.template;

public class Main {
    public static void main(String[] args){
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        handlerA.handleRequest(13);
        handlerA.handleRequest(100);

        handlerB.handleRequest(30);
    }
}
