package edu.wzm.creator.factory_method.template;

public class Main {
    public static void main(String[] args){
        Factory addFactory = new AddFactory();
        Operator add = addFactory.createOperator();
        add.setNumA(1);
        add.setNumB(3);
        System.out.println("Add: " + add.getResult());

        Factory subFactory = new SubFactory();
        Operator sub = subFactory.createOperator();
        sub.setNumA(1);
        sub.setNumB(3);
        System.out.println("Sub: " + sub.getResult());
    }
}
