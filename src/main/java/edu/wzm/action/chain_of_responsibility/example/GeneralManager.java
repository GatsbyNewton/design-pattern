package edu.wzm.action.chain_of_responsibility.example;

import java.util.Objects;

public class GeneralManager implements Manager {
    private String name;
    private Manager superior;

    public GeneralManager(String name) {
        this.name = name;
    }

    @Override
    public void setSuccessor(Manager manager) {
        this.superior = manager;
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.equals(request.getReason(), "请假") && request.getNumber() < 15){
            System.out.println("General Manager " + name + " 已批准" + request.getName() + request.getReason());
        }else if (Objects.equals(request.getReason(), "加薪") && request.getNumber() < 1000){
            System.out.println("General Manager " + name + " 已批准" + request.getName() + request.getReason());
        }else if (Objects.equals(request.getReason(), "加薪") && request.getNumber() >= 1000){
            System.out.println("General Manager " + name + " 不同意" + request.getName() + request.getReason());
        }else {
            System.out.println("General Manager " + name + " 无权处理。");
        }
    }
}
