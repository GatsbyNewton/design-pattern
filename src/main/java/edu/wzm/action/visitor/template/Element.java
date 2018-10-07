package edu.wzm.action.visitor.template;

public interface Element {

    void accept(Visitor visitor);
}
