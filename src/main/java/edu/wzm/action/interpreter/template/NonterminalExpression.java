package edu.wzm.action.interpreter.template;

public class NonterminalExpression implements Interpreter{
    @Override
    public void interpret(Context context) {
        System.out.println("非终结符解释器解释：" + context.getInput());
    }
}
