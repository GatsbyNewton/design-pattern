package edu.wzm.action.template_method.template;

public class ConcreteClassB extends AbstractClass{
    @Override
    protected void primitiveOperation1() {
        System.out.println("B 具体实现 1");
    }

    @Override
    protected void primitiveOperation2() {
        System.out.println("B 具体实现 2");
    }
}
