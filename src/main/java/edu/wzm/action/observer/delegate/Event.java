package edu.wzm.action.observer.delegate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamType(params);
    }

    private void contractParamType(Object[] params){
        int paramNum = params.length;
        this.paramTypes = new Class[paramNum];
        for (int i = 0; i < paramNum; i++){
            paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke()throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        /* 判断是否存在这个函数 */
        Method method = object.getClass().getMethod(methodName, paramTypes);
        if (Objects.equals(method, null)){
            return;
        }

        /* 利用反射机制调用这个方法 */
        method.invoke(object, params);
    }
}
