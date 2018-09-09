package edu.wzm.actor.strategy.template;

public class Main {
    public static void main(String[] args){
        Context context = new Context();
        Strategy strategy;

        strategy = new ConcreteStrategyA();
        context.setStrategy(strategy);
        context.algorithm();

        strategy = new ConcreteStrategyC();
        context.setStrategy(strategy);
        context.algorithm();

        strategy = new ConcreteStrategyB();
        context.setStrategy(strategy);
        context.algorithm();
    }
}
