package edu.wzm.structure.proxy.example;

public class Proxy implements GiveGift {
    /** 追求者 */
    private Pursuer pursuer;

    public Proxy(Girl girl) {
        this.pursuer = new Pursuer(girl);
    }

    @Override
    public void giveDolls() {
        pursuer.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuer.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuer.giveChocolate();
    }
}
