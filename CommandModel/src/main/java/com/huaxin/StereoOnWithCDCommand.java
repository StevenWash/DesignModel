package com.huaxin;

public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo =stereo;
    }

    public void execute() {
        if (stereo!=null){
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        }
    }

    public void undo() {

    }
}
