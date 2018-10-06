package edu.wzm.structure.flyweight.template;

public class UnsharedConcreteFlyweight implements Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不共享的 Flyweight：" + extrinsicState);
    }
}
