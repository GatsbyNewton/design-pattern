package edu.wzm.action.state.example;

public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("请稍等，糖果正在为你发售。");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("糖果正在为你发售，不能退币。");
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果正在为你发售，请不要重复转动曲柄。");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else {
            System.out.println("对不起，糖果已售罄。");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
