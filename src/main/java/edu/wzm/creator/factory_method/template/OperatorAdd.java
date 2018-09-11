package edu.wzm.creator.factory_method.template;

public class OperatorAdd extends Operator {

    @Override
    public int getResult() {
        return numA + numB;
    }
}
