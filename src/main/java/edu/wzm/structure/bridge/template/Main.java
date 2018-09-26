package edu.wzm.structure.bridge.template;

public class Main {
    public static void main(String[] args){
        Abstraction abstraction = new RefinedAbstraction();

        ConcreteImplementorA implementorA = new ConcreteImplementorA();
        abstraction.setImplementor(implementorA);
        abstraction.operation();

        ConcreteImplementorB implementorB = new ConcreteImplementorB();
        abstraction.setImplementor(implementorB);
        abstraction.operation();
    }
}
