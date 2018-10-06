package edu.wzm.action.interpreter.template;

public class TerminalExpression implements Interpreter {
    @Override
    public void interpret(Context context) {
        System.out.println("终结符解释器解释：" + context.getInput());
    }
}
