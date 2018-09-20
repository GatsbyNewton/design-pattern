package edu.wzm.action.state.template;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("状态B：接收的是负数，现在转换成自然数。");
        context.setState(new ConcreteStateC());
    }
}
