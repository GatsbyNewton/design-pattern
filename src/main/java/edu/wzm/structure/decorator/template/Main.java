package edu.wzm.structure.decorator.template;

public class Main {
    public static void main(String[] args){
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorA d1 = new ConcreteDecoratorA();
        ConcreteDecoratorB d2 = new ConcreteDecoratorB();

        cc.operation();
        System.out.println("----------------------");

        d1.setComponent(cc);
        d1.operation();
        System.out.println("----------------------");

        d2.setComponent(d1);
        d2.operation();
    }
}
