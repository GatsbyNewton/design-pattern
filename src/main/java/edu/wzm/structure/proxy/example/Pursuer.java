package edu.wzm.structure.proxy.example;

public class Pursuer implements GiveGift {
    private Girl girl;

    public Pursuer(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.getName() + "，送你洋娃娃。");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.getName() + "，送你玫瑰花。");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.getName() + "，送你巧克力。");
    }
}
