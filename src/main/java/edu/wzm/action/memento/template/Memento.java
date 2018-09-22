package edu.wzm.action.memento.template;

public class Memento {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
