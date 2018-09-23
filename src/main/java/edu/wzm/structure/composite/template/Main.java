package edu.wzm.structure.composite.template;

public class Main {
    public static void main(String[] args){
        Component root = new Composite("root");

        Component x = new Composite("Composite X");
        x.add(new Leaf("Leaf Xa"));
        x.add(new Leaf("Leaf Xb"));

        root.add(x);

        Component y = new Composite("Composite Y");
        y.add(new Leaf("Leaf Ya"));

        root.add(y);

        root.display(1);
    }
}
