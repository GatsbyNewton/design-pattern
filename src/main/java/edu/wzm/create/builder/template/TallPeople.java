package edu.wzm.creator.builder.template;

public class TallPeople implements PeopleBuilder {
    private String head;
    private String body;
    private String leftArm;
    private String rightArm;
    private String leftLeg;
    private String rightLeg;

    @Override
    public void buildHead(){
        System.out.println("创建一个高人的头部");
    }

    @Override
    public void buildBody(){
        System.out.println("创建一个高人的身体");
    }

    @Override
    public void buildLeftArm(){
        System.out.println("创建一只高人的左手");
    }

    @Override
    public void buildRightArm(){
        System.out.println("创建一只高人的右手");
    }

    @Override
    public void buildLeftLeg(){
        System.out.println("创建一只高人的左腿");
    }

    @Override
    public void buildRightLeg(){
        System.out.println("创建一只高人的右腿");
    }
}
