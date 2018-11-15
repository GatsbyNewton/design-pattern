package edu.wzm.creation.singleton;

/**
 * 双重检查式单例模式，线程安全
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton = null;

    private DoubleCheckSingleton(){}

    public static DoubleCheckSingleton getSingleton(){
        if (singleton == null){
            synchronized (DoubleCheckSingleton.class){
                if (singleton == null){
                    singleton = new DoubleCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
