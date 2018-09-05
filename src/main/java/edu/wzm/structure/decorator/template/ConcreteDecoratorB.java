package edu.wzm.structure.decorator.template;

import java.util.stream.Stream;

public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        printNumber();
        System.out.println("具体装饰对象B的操作");
    }

    private void printNumber(){
        Stream.iterate(0, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);
    }
}
