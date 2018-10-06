package edu.wzm.action.mediator.template;

public class Main {
    public static void main(String[] args){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleagueA = new ConcreteColleagueA("同事A", mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB("同事B", mediator);

        mediator.setColleagueA(colleagueA);
        mediator.setColleagueB(colleagueB);

        colleagueA.send("我是发送者A");
        colleagueB.send("我是接收者B");
    }
}
