package edu.wzm.actor.observer.template;

public class Main {
    public static void main(String[] args){
        Subject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverA("Jimmy"));
        subject.registerObserver(new ConcreteObserverB("Bill"));
        subject.notifyObservers();
    }
}
