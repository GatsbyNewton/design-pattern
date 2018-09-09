package edu.wzm.structure.proxy.template;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求！");
    }
}
