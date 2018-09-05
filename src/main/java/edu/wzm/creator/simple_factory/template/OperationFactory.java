package edu.wzm.creator.simple_factory.template;

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

    public static void main(String[] args){
        Operator add = OperationFactory.createOperator("+");
        add.setNumA(1);
        add.setNumB(2);
        System.out.println("numA + numB = " + add.getResult());

        Operator sub = OperationFactory.createOperator("-");
        sub.setNumA(1);
        sub.setNumB(2);
        System.out.println("numA - numB = " + sub.getResult());
    }
}
