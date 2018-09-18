package edu.wzm.actor.template_method.template;

public class ConcreteClassA extends AbstractClass{
    @Override
    protected void primitiveOperation1() {
        System.out.println("A 具体实现 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("A 具体实现 2");
    }
}
