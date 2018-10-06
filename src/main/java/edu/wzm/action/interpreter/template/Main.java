package edu.wzm.action.interpreter.template;

public class Main {
    public static void main(String[] args){
        Context context = new Context();
        context.setInput("Input message");

        Interpreter nonterminalExpression = new NonterminalExpression();
        Interpreter terminalExpression = new TerminalExpression();
        nonterminalExpression.interpret(context);
        terminalExpression.interpret(context);
    }
}
