package edu.wzm.action.mediator.template;

public class ConcreteColleagueA implements Colleague{
    private String name;
    private Mediator mediator;

    public ConcreteColleagueA(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message){
        mediator.send(message, this);
    }

    public void notify(String message){
        System.out.println(name + "收到信息：" + message);
    }
}
