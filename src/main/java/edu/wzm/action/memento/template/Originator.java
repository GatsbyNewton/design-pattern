package edu.wzm.action.memento.template;

public class Originator {
    private String state;

    public Memento createMemento(String state){
        Memento memento = new Memento();
        memento.setState(state);
        return memento;
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void show(){
        System.out.println("Memento{state=" + state + "}");
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
