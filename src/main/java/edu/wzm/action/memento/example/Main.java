package edu.wzm.action.memento.example;

public class Main {
    public static void main(String[] args){
        int initVitality = 100;
        int initAttack = 100;
        int initDefense = 100;
        Role role = new Role();
        role.setVitality(initVitality);
        role.setAttack(initAttack);
        role.setDefense(initDefense);
        System.out.println("英雄初始化状态：");
        role.show();

        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.createMemento(initVitality, initAttack, initDefense));

        int newVitality = 10;
        int newAttack = 30;
        int newDefense = 40;
        role.setVitality(newVitality);
        role.setAttack(newAttack);
        role.setDefense(newDefense);
        System.out.println("\n英雄战斗之后的状态：");
        role.show();

        role.recoveryState(caretaker.getMemento());
        System.out.println("\n英雄战斗恢复之后的状态：");
        role.show();
    }
}
