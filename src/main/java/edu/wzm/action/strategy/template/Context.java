package edu.wzm.action.strategy.template;

public class Context {
    private Strategy strategy;

    public void algorithm(){
        strategy.algorithmStrategy();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
