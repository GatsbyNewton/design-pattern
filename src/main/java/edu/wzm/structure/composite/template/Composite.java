package edu.wzm.structure.composite.template;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void display(int depth) {
        System.out.println(flag(depth) + name);

        for (Component child : children){
            child.display(depth + 2);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    private String flag(int depth){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= depth; i++){
            sb.append('-');
        }

        return sb.toString();
    }
}
