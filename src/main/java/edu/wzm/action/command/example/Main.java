package edu.wzm.action.command.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        RemoteController controller = new RemoteController();

        Light livingRoomLight = new Light("Living Room");
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        System.out.println("Light: ");
        controller.setCommand(0, lightOnCommand, lightOffCommand);
        controller.onButtonWasPushed(0);
        controller.offButtonWasPushed(0);
        controller.undoButtonWasPushed();

        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room");
        Command ceilingFanMediumCommand = new CeilingFanMediumCommand(livingRoomCeilingFan);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        System.out.println("\nCeiling Fan: ");
        controller.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand);
        controller.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
        controller.onButtonWasPushed(0);
        controller.onButtonWasPushed(1);
        controller.offButtonWasPushed(1);

        System.out.println("\nMacro Command: ");
        List<Command> commands = new ArrayList<>();
        commands.add(lightOnCommand);
        commands.add(ceilingFanMediumCommand);
        Command macroCommand = new MacroCommand(commands);
        macroCommand.execute();
    }
}
