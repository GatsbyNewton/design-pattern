package edu.wzm.creation.simple_factory.template;

public class OperationFactory {

    public static Operator createOperator(String type){
        Operator operator;
        switch (type){
            case "+":
                operator = new OperatorAdd();
                break;
            case "-":
                operator = new OperatorSub();
                break;
            default:
                operator = null;
                break;
        }

        return operator;
    }
}
