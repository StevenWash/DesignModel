package com.huaxin;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;


    private static final int SWITCH_NUM =7;

    public RemoteControl(){
        onCommands = new Command[SWITCH_NUM];
        offCommands = new Command[SWITCH_NUM];

        Command noCommand = new NoCommand();
        for (int i=0; i<SWITCH_NUM;i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot ,Command onCommand ,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void btnOnPressed(int slot){
        onCommands[slot].execute();

    }

    public void btnOffPressed(int slot){
        offCommands[slot].execute();
    }
}
