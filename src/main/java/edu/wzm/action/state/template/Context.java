package edu.wzm.action.state.template;

public class Context {
    private int integer;

    private State state;

    public Context(State state, int integer) {
        this.state = state;
        this.integer = integer;
    }

    public void request(){
        state.handle(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getInteger() {
        return integer;
    }
}
