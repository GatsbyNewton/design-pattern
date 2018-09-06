package edu.wzm.structure.decorator.example;

public class Shoe extends Finery{
    @Override
    public void show() {
        System.out.println("球鞋");
        super.show();
    }
}
