package edu.wzm.action.state.template;

public class Main {
    public static void main(String[] args){
        Context context  = new Context(new ConcreteStateA(), 5);
        context.request();
        context.request();
        context.request();

        System.out.println();
        context  = new Context(new ConcreteStateA(), -2);
        context.request();
        context.request();
        context.request();
    }
}
