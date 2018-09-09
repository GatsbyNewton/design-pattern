package edu.wzm.actor.strategy.example;

public class CashReturn implements CashSuper {
    private double threshold;
    private double moneyReturn;

    public CashReturn(double threshold, double moneyReturn) {
        this.threshold = threshold;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money > threshold){
            return money - Math.floor(money / threshold) * moneyReturn;
        }else {
            return money;
        }
    }
}
