package edu.wzm.structure.proxy.template;

public class Proxy implements Subject {
    private Subject realSubject;

    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
