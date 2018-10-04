package edu.wzm.action.command.example;

import java.util.ArrayList;
import java.util.List;

public class RemoteController {
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command undoCommand;

    public RemoteController() {
        this.onCommands = new ArrayList<>();
        this.offCommands = new ArrayList<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands.add(slot, onCommand);
        offCommands.add(slot, offCommand);
    }

    public void onButtonWasPushed(int slot){
        onCommands.get(slot).execute();
        undoCommand = onCommands.get(slot);
    }

    public void offButtonWasPushed(int slot){
        offCommands.get(slot).execute();
        undoCommand = offCommands.get(slot);
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
