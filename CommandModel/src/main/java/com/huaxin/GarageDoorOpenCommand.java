package com.huaxin;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor door){
        garageDoor = door;
    }

    public void execute(){
        garageDoor.up();
    }

    public void undo() {

    }
}
