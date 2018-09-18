package edu.wzm.create.factory_method.template;

public class AddFactory implements Factory {
    @Override
    public Operator createOperator() {
        return new OperatorAdd();
    }
}
