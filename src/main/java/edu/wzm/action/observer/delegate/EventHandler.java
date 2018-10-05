package edu.wzm.action.observer.delegate;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class EventHandler {
    private List<Event> events;

    public EventHandler(){
        this.events = new ArrayList<>();
    }

    /**
     * 添加被执行方法的事件
     * @param object 被执行方法所属的对象
     * @param methodName 被执行的方法名
     * @param params 被执行的方法参数列表
     */
    public void addEvent(Object object, String methodName, Object... params){
        events.add(new Event(object, methodName, params));
    }

    /**
     * 调用被执行的方法
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    public void notifyALL()throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (Event event : events){
            event.invoke();
        }
    }
}
