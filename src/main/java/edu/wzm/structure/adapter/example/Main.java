package edu.wzm.structure.adapter.example;

public class Main {
    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println();

        Turkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println();

        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
