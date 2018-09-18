package edu.wzm.create.simple_factory.template;

public abstract class Operator {
    protected int numA;
    protected int numB;

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public abstract int getResult();
}
