package edu.wzm.action.chain_of_responsibility.example;

public class Main {
    public static void main(String[] args){
        Manager teamLeader = new TeamLeader("Bill");
        Manager majordomo = new Majordomo("Jobs");
        Manager generalManager = new GeneralManager("Jimmy");
        teamLeader.setSuccessor(majordomo);
        majordomo.setSuccessor(generalManager);

        Request request1 = new Request();
        request1.setName("张三");
        request1.setReason("请假");
        request1.setNumber(8);

        teamLeader.handleRequest(request1);

        Request request2 = new Request();
        request2.setName("李四");
        request2.setReason("加薪");
        request2.setNumber(500);

        teamLeader.handleRequest(request2);

        Request request3 = new Request();
        request3.setName("王五");
        request3.setReason("加薪");
        request3.setNumber(2000);

        teamLeader.handleRequest(request3);
    }
}
