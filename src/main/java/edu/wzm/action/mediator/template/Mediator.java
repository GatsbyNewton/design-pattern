package edu.wzm.action.mediator.template;

public interface Mediator {

    void send(String message, Colleague colleague);
}
