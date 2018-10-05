package edu.wzm.action.observer.delegate;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public class Event {
    private Object object;          // 被执行的方法所属对象
    private String methodName;      // 被执行的方法名
    private Object[] params;        // 被执行的方法参数列表
    private Class[] paramTypes;     // 被执行的方法参数类型列表

    public Event(Object object, String methodName, Object... params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamType(params);
    }

    /**
     * 根据被执行方法的参数，获取参数对应的类型
     * @param params
     */
    private void contractParamType(Object[] params){
        int paramNum = params.length;
        this.paramTypes = new Class[paramNum];
        for (int i = 0; i < paramNum; i++){
            paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * 调用被执行的方法
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
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
