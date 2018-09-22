package edu.wzm.structure.adapter.template;

public class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
