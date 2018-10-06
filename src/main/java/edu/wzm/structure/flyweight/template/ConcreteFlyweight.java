package edu.wzm.structure.flyweight.template;

public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int extrinsicState) {
        System.out.println("共享的 Flyweight：" + extrinsicState);
    }
}
