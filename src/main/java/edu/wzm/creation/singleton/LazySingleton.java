package edu.wzm.creation.singleton;

/**
 * 懒汉式单例模式，非线程安全
 */
public class LazySingleton {

    private static LazySingleton singleton = null;

    private LazySingleton(){}

    public LazySingleton getSingleton(){
        if (singleton == null){
            singleton = new LazySingleton();
        }

        return singleton;
    }
}
