package edu.wzm.structure.decorator.example;

public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装饰者：" + name);
    }
}
