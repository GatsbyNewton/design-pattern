package edu.wzm.creation.factory_method.template;

public class OperatorAdd extends Operator {

    @Override
    public int getResult() {
        return numA + numB;
    }
}
