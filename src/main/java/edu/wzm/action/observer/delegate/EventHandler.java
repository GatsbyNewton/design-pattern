package edu.wzm.action.observer.delegate;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> events;

    public EventHandler(){
        this.events = new ArrayList<>();
    }

    public void addEvent(Object object, String methodName, Object... params){
        events.add(new Event(object, methodName, params));
    }

    public void notifyALL()throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event : events){
            event.invoke();
        }
    }
}
