package com.huaxin;

public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command lastCommand;


    private static final int SWITCH_NUM =7;

    public RemoteControlWithUndo(){
        onCommands = new Command[SWITCH_NUM];
        offCommands = new Command[SWITCH_NUM];

        Command noCommand = new NoCommand();
        for (int i=0; i<SWITCH_NUM;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        lastCommand = noCommand;
    }

    public void setCommand(int slot ,Command onCommand ,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void btnOnPressed(int slot){
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void btnOffPressed(int slot){
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void undoPressed() {
        lastCommand.undo();
    }
}
