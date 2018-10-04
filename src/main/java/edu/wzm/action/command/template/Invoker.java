package edu.wzm.action.command.template;

public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void request(){
        command.execute();
    }
}
