package edu.wzm.creation.singleton;

/**
 * 饿汉式单例模式，线程安全
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){}

    public Singleton getSingleton(){
        return singleton;
    }
}
