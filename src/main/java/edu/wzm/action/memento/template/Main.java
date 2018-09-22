package edu.wzm.action.memento.template;

public class Main {
    public static void main(String[] args){
        Originator originator = new Originator();
        String onState = "ON";
        originator.setState(onState);
        System.out.println("Originator初始状态：");
        originator.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento(onState));    // 创建备忘录

        String offState = "OFF";
        originator.setState(offState);
        System.out.println("\nOriginator更换状态：");
        originator.show();

        System.out.println("\nOriginator获取备忘状态：");
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
