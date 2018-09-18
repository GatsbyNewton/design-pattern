package edu.wzm.actor.observer.template;

public class ConcreteObserverA implements Observer {
    private String name;

    public ConcreteObserverA(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + "观察者收到。");
    }
}
