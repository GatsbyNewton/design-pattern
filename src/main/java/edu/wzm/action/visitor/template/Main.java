package edu.wzm.action.visitor.template;

public class Main {
    public static void main(String[] args){
        ObjectStructure structure = new ObjectStructure();
        structure.attach(new ConcreteElementA());
        structure.attach(new ConcreteElementB());

        Visitor visitorA = new ConcreteVisitorA();
        Visitor visitorB = new ConcreteVisitorA();

        structure.show(visitorA);
        structure.show(visitorB);
    }
}
