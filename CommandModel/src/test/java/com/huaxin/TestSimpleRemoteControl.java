package com.huaxin;

public class TestSimpleRemoteControl {
    public static void main(String[] args) {
        SimpleRemoteControl src = new SimpleRemoteControl();

        Light light =new Light("");
        Command command =new LightOnCommand(light);
        src.setCommand(command);
        src.buttonPressed();

        GarageDoor door =new GarageDoor();
        command = new GarageDoorOpenCommand(door);

        src.setCommand(command);
        src.buttonPressed();
    }
}
