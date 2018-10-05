package edu.wzm.action.chain_of_responsibility.example;

import java.util.Objects;

public class Majordomo implements Manager {
    private String name;
    private Manager superior;

    public Majordomo(String name) {
        this.name = name;
    }

    @Override
    public void setSuccessor(Manager manager) {
        this.superior = manager;
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.equals(request.getReason(), "请假") && request.getNumber() < 10){
            System.out.println("Majordomo " + name + " 已批准"  + request.getName() + request.getReason());
        }else {
            superior.handleRequest(request);
        }
    }
}
