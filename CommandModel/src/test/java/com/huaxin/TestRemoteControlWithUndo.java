package com.huaxin;

public class TestRemoteControlWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControlWithUndo.setCommand(0,lightOnCommand,lightOnCommand);

        remoteControlWithUndo.btnOnPressed(0);
        remoteControlWithUndo.undoPressed();
    }
}
