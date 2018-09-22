package edu.wzm.action.state.example;

public class HasQuarterState implements State{
    private GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请不要重复投币。");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已为你退币。");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("你已转动了曲柄。");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("请先转动曲柄，才能发放糖果。");
    }
}
