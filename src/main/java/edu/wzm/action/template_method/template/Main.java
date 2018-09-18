package edu.wzm.actor.template_method.template;

public class Main {
    public static void main(String[] args){
        AbstractClass a = new ConcreteClassA();
        a.tempalteMethod();

        AbstractClass b = new ConcreteClassB();
        b.tempalteMethod();
    }
}
