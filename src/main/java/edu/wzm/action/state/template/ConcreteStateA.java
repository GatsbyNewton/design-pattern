package edu.wzm.action.state.template;

public class ConcreteStateA implements State {


    @Override
    public void handle(Context context) {
        System.out.println("状态A已触发");
        if (context.getInteger() < 0) {
            context.setState(new ConcreteStateB());
        }else {
            context.setState(new ConcreteStateC());
        }
    }
}
