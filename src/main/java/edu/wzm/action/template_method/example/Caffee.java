package edu.wzm.actor.template_method.example;

public class Caffee extends CaffeineBeverageWithHook{
    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void addCondiments() {

    }
}
