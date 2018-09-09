package edu.wzm.structure.proxy.template;

public class Main {
    public static void main(String[] args){
        Subject proxy = new Proxy();
        proxy.request();
    }
}
