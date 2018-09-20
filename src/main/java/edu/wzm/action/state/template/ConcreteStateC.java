package edu.wzm.action.state.template;

public class ConcreteStateC implements State {
    @Override
    public void handle(Context context) {
        System.out.println("状态C：已经是自然数了，值为 " + context.getInteger());
    }
}
