package edu.wzm.actor.strategy.example;

public class CashRebate implements CashSuper {

    private float rebate;

    public CashRebate(float rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }
}
