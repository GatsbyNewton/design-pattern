package edu.wzm.action.observer.delegate;

public interface Subject {

    void addObserver(Object object, String methodName, Object... params);

    void notifyObservers();
}
