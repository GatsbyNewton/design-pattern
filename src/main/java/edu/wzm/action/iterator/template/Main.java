package edu.wzm.action.iterator.template;

public class Main {
    public static void main(String[] args){
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("one");
        aggregate.addItem("two");
        aggregate.addItem("three");
        aggregate.addItem("four");

        Iterator iterator = new ConcreteIterator(aggregate);
        Element first = iterator.first();
        System.out.println("first=" + first);

        while (!iterator.isDone()){
            System.out.println(iterator.next().getElement());
        }
    }
}
