package edu.wzm.action.state.example;

public class Main {
    public static void main(String[] args){
        GumballMachine gumballMachine = new GumballMachine(3);
        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.dispense();

        gumballMachine.refill(5);
    }
}
