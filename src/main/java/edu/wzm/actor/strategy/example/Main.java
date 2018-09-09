package edu.wzm.actor.strategy.example;

public class Main {

    private CashFactory factory;

    public static void main(String[] args){
        strategyPattern();

        simpleFactoryAndStrategyParttern();
    }

    public static void strategyPattern(){
        CashSuper cashSuper = new CashRebate(0.7f);
        System.out.println(cashSuper.acceptCash(999.99));
    }

    public static void simpleFactoryAndStrategyParttern(){
        CashFactory factory = new CashFactory();
        System.out.println("---------- Normal -----------");
        factory.setMoney(999.99);
        factory.pay("Normal");

        System.out.println("---------- Rebate -----------");
        factory.setMoney(999.99);
        factory.setRebate(0.8f);
        factory.pay("Rebate");

        System.out.println("---------- Return -----------");
        factory.setMoney(999.99);
        factory.setThreshold(900);
        factory.setMoneyReturn(200);
        factory.pay("Return");
    }
}
