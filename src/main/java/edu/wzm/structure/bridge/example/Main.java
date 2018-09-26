package edu.wzm.structure.bridge.example;

public class Main {
    public static void main(String[] args){
        HandsetBrand nokia = new HandsetNokia();

        System.out.println("Nokia手机运行...");
        nokia.setHandsetSoft(new HandsetAddressList());
        nokia.operation();
        nokia.setHandsetSoft(new HandsetGame());
        nokia.operation();

        HandsetBrand iphone = new HandsetIPhone();

        System.out.println("\nIPhone手机运行...");
        iphone.setHandsetSoft(new HandsetAddressList());
        iphone.operation();
        iphone.setHandsetSoft(new HandsetGame());
        iphone.operation();
    }
}
