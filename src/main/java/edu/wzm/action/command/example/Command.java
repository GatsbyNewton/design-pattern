package edu.wzm.action.command.example;

public interface Command {

    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
