package edu.wzm.structure.flyweight.template;

public class Main {
    public static void main(String[] args){
        FlyweightFactory factory = new FlyweightFactory();

        int extrinsicState = 20;
        Flyweight x = factory.getFlyweight("X");
        x.operation(extrinsicState--);

        Flyweight y = factory.getFlyweight("Y");
        y.operation(extrinsicState--);

        Flyweight z = factory.getFlyweight("Z");
        z.operation(extrinsicState--);

        Flyweight unshared = new UnsharedConcreteFlyweight();
        unshared.operation(extrinsicState--);
    }
}
