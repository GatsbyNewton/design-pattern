package edu.wzm.structure.proxy.example;

public class Main {
    public static void main(String[] args){
        Girl cher = new Girl("雪儿");

        Proxy proxy = new Proxy(cher);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
