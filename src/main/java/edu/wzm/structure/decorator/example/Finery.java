package edu.wzm.structure.decorator.example;

import java.util.Objects;

public abstract class Finery extends Person{
    protected Person component;

    public void decorate(Person component){
        this.component = component;
    }

    @Override
    public void show() {
        if (!Objects.equals(component, null)){
            component.show();
        }
    }
}
