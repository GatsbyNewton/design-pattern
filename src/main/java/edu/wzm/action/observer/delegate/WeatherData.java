package edu.wzm.action.observer.delegate;

import java.lang.reflect.InvocationTargetException;

public class WeatherData implements Subject {

    private EventHandler eventHandler;

    public WeatherData() {
        this.eventHandler = new EventHandler();
    }

    @Override
    public void addObserver(Object object, String methodName, Object... params) {
        eventHandler.addEvent(object, methodName, params);
    }

    @Override
    public void notifyObservers() {
        try {
            eventHandler.notifyALL();
        }catch (NoSuchMethodException nsme){
            nsme.printStackTrace();
        }catch (IllegalAccessException iae){
            iae.printStackTrace();
        }catch (InvocationTargetException ite){
            ite.printStackTrace();
        }
    }
}
