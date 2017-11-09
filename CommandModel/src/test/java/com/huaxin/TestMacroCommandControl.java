package com.huaxin;

public class TestMacroCommandControl {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light =new Light("Living Room");
        Stereo stereo = new Stereo("Living Romm");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);

        Command[] commands ={lightOnCommand,stereoOnWithCDCommand};
        MacroCommand macroCommand = new MacroCommand(commands);

        remoteControl.setCommand(0,macroCommand,null);
        remoteControl.btnOnPressed(0);
    }
}
