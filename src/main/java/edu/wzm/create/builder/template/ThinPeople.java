package edu.wzm.creator.builder.template;

public class ThinPeople implements PeopleBuilder{
    private String head;
    private String body;
    private String leftArm;
    private String rightArm;
    private String leftLeg;
    private String rightLeg;

    @Override
    public void buildHead(){
        System.out.println("创建一个瘦人的头部");
    }

    @Override
    public void buildBody(){
        System.out.println("创建一个瘦人的身体");
    }

    @Override
    public void buildLeftArm(){
        System.out.println("创建一只瘦人的左手");
    }

    @Override
    public void buildRightArm(){
        System.out.println("创建一只瘦人的右手");
    }

    @Override
    public void buildLeftLeg(){
        System.out.println("创建一只瘦人的左腿");
    }

    @Override
    public void buildRightLeg(){
        System.out.println("创建一只瘦人的右腿");
    }
}
