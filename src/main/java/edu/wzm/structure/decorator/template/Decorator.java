package edu.wzm.structure.decorator.template;

import java.util.Objects;

public class Decorator implements Component {

    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        if (!Objects.equals(component, null)){
            component.operation();
        }
    }
}
