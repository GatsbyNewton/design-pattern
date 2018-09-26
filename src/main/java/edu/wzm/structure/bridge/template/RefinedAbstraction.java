package edu.wzm.structure.bridge.template;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        implementor.operation();
    }
}
