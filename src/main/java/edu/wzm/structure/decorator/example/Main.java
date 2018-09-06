package edu.wzm.structure.decorator.example;

public class Main {
    public static void main(String[] args){
        Person person = new Person("Jimmy");

        System.out.println("第一种装饰");
        Finery tshirt = new TShirts();
        Finery bigTrouser = new BigTrouser();

        tshirt.decorate(person);
        bigTrouser.decorate(tshirt);
        bigTrouser.show();

        System.out.println("第二种装饰");
        Finery trouser = new BigTrouser();
        Finery shoe = new Shoe();

        trouser.decorate(person);
        shoe.decorate(trouser);
        shoe.show();
    }
}
