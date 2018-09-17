package edu.wzm.structure.facade.template;

public class Facade {
    private SystemOne one;
    private SystemTwo two;
    private SystemThree three;

    public Facade() {
        this.one = new SystemOne();
        this.two = new SystemTwo();
        this.three = new SystemThree();
    }

    public void methodA(){
        one.methodOne();
        two.methodTwo();
    }

    public void methodB(){
        two.methodTwo();
        three.methodThree();
    }
}
