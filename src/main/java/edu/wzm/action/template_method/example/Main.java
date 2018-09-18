package edu.wzm.action.template_method.example;

public class Main {
    public static void main(String[] args){
        System.out.println("沏茶...");
        TeaWithHook tea = new TeaWithHook();
        tea.askCustomer("yes");
        tea.prepareRecipe();

        System.out.println("\n冲咖啡...");
        CaffeineBeverageWithHook coffee = new Caffee();
        coffee.prepareRecipe();
    }
}
