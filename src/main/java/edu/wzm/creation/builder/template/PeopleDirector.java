package edu.wzm.creation.builder.template;

public class PeopleDirector {
    private PeopleBuilder builder;

    public PeopleDirector(PeopleBuilder builder) {
        this.builder = builder;
    }

    public void buildPeople(){
        builder.buildHead();
        builder.buildBody();
        builder.buildLeftArm();
        builder.buildRightArm();
        builder.buildLeftLeg();
        builder.buildRightLeg();
    }
}
