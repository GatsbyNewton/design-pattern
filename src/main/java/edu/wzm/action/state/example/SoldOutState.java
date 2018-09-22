package edu.wzm.action.state.example;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("对不起，你不能投币，糖果已售罄。");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("对不起，糖果已售罄。");
    }

    @Override
    public void turnCrank() {
        System.out.println("对不起，你不能转动曲柄，糖果已售罄。");
    }

    @Override
    public void dispense() {
        System.out.println("对不起，糖果已售罄。");
    }

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
