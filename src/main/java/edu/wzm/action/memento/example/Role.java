package edu.wzm.action.memento.example;

public class Role {
    private int vitality;
    private int attack;
    private int defense;

    public RoleStateMemento createMemento(int vitality, int attack, int defense){
        return new RoleStateMemento(vitality, attack, defense);
    }

    public void recoveryState(RoleStateMemento memento){
        this.vitality = memento.getVitality();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
    }

    public void show(){
        System.out.println("Role state: vitality=" + vitality + ", attack=" + attack + ", defense=" + defense);
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
