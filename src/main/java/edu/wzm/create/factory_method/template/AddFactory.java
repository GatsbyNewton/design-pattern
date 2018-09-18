package edu.wzm.creator.factory_method.template;

public class AddFactory implements Factory {
    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }
}
