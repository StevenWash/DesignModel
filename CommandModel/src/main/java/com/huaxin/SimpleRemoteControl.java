package com.huaxin;

public class SimpleRemoteControl {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonPressed(){
        if(command==null){
            System.out.println("您还没有选择按哪一个按钮");
        }else {
            command.execute();
        }
    }
}
