package edu.wzm.actor.template_method.example;

import java.util.Objects;

public class TeaWithHook extends CaffeineBeverageWithHook {
    private String wantsCondiments;

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add Lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return Objects.equals(wantsCondiments, "yes") ? true : false;
    }

    public void askCustomer(String answer){
        this.wantsCondiments =  answer;
    }
}
