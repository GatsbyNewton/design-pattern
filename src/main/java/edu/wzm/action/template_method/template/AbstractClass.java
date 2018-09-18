package edu.wzm.action.template_method.template;

public abstract class AbstractClass {

    abstract void primitiveOperation1();

    abstract void primitiveOperation2();

    public void concreteOperation(){
        System.out.println("模板方法模式实现");
    }

    /**
     * 模板方法
     */
    public final void tempalteMethod(){
        primitiveOperation1();
        primitiveOperation2();
        concreteOperation();
    }
}
