package edu.wzm.creation.singleton;

/**
 * 懒汉式单例模式，线程安全
 */
public class LazyThreadSafeSingleton {

    private static LazyThreadSafeSingleton singleton = null;

    private LazyThreadSafeSingleton(){}

    public synchronized LazyThreadSafeSingleton getSingleton(){
        if (singleton == null){
            singleton = new LazyThreadSafeSingleton();
        }

        return singleton;
    }
}
