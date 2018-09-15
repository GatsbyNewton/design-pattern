package edu.wzm.actor.template_method.example;

public abstract class CaffeineBeverageWithHook {

    public void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()){
            addCondiments();
        }
    }

    protected abstract void brew();

    protected abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling Water");
    }

    protected void pourInCup(){
        System.out.println("Pouring into cup");
    }

    protected boolean customerWantsCondiments(){
        return true;
    }
}
