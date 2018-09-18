package edu.wzm.creator.builder.template;

public class Main {
    public static void main(String[] args){
        TallPeople tallPeople = new TallPeople();
        PeopleDirector tallDirector = new PeopleDirector(tallPeople);
        tallDirector.buildPeople();

        System.out.println("\n----------------");
        ThinPeople thinPeople = new ThinPeople();
        PeopleDirector thinDirector = new PeopleDirector(thinPeople);
        thinDirector.buildPeople();
    }
}
