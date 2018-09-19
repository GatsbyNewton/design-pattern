package edu.wzm.creation.factory_method.template;

public class SubFactory implements Factory {
    @Override
    public Operator createOperator() {
        return new OperatorSub();
    }
}
