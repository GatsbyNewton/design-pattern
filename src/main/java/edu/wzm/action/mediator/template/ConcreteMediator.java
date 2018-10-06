package edu.wzm.action.mediator.template;

import java.util.Objects;

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA colleagueA;
    private ConcreteColleagueB colleagueB;

    @Override
    public void send(String message, Colleague colleague) {
        if (Objects.equals(colleagueA, colleague)){
            colleagueB.notify(message);
        }else if (Objects.equals(colleagueB, colleague)){
            colleagueA.notify(message);
        }
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        this.colleagueB = colleagueB;
    }
}
