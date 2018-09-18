package edu.wzm.create.factory_method.template;

public class SubFactory implements Factory {
    @Override
    public Operator createOperator() {
        return new OperatorSub();
    }
}
