package edu.wzm.creation.singleton;

/**
 * 静态内部类单例模式，线程安全
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    public StaticInnerClassSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
}
