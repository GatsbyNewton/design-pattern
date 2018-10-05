package edu.wzm.action.chain_of_responsibility.example;

import java.util.Objects;

public class TeamLeader implements Manager {
    private String name;
    private Manager superior;

    public TeamLeader(String name) {
        this.name = name;
    }

    @Override
    public void setSuccessor(Manager manager) {
        this.superior = manager;
    }

    @Override
    public void handleRequest(Request request) {
        if (Objects.equals(request.getReason(), "请假") && request.getNumber() < 5){
            System.out.println("Team Leader " + name + " 已批准"+ request.getName() + request.getReason());
        }else {
            superior.handleRequest(request);
        }
    }
}
