package edu.wzm.creation.simple_factory.template;

public class OperatorAdd extends Operator {

    @Override
    public int getResult() {
        return numA + numB;
    }
}
