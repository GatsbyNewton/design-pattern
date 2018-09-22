package edu.wzm.action.state.example;

public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你已经投入25美分。");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没有投币。");
    }

    @Override
    public void turnCrank() {
        System.out.println("你转动了曲柄，但没有投币。");
    }

    @Override
    public void dispense() {
        System.out.println("请先投币，才能发放糖果。");
    }
}
