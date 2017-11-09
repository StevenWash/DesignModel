package com.huaxin;

public class TestRemoteControl {

    public static void main(String[] args) {
        RemoteControl remoteControl =new RemoteControl();

        Light light =new Light("Living Room ");
        GarageDoor garageDoor =new GarageDoor();
        Stereo stereo =new Stereo("Book Room ");

        Command livingRoomLightOn = new LightOnCommand(light);

        Command garageDoorUp = new GarageDoorOpenCommand(garageDoor);

        Command stereOnWithCD =new StereoOnWithCDCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,null);
        remoteControl.setCommand(1,garageDoorUp,null);
        remoteControl.setCommand(2,stereOnWithCD,null);

        remoteControl.btnOnPressed(0);
        remoteControl.btnOnPressed(1);
        remoteControl.btnOnPressed(2);
    }
}
