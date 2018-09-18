package edu.wzm.action.observer.template;

public class ConcreteObserverB implements Observer {
    private String name;

    public ConcreteObserverB(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "观察者收到");
    }
}
