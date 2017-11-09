package com.huaxin;

public class Stereo {
    private String where;

    public Stereo(){
    }

    public  Stereo(String where){
        this.where = where;
    }

    public void on(){
        System.out.println("Stereo is on in "+where);
    }

    public void off(){
        System.out.println("Stereo is off in "+where);
    }

    public void setCD(){
        System.out.println("Stereo is setted CD in "+where);
    }

    public void setDVD(){
        System.out.println("Stereo is setted DVD in "+where);
    }

    public void setRadio(){
        System.out.println("Stereo is setted Radio in "+where);
    }
    public void setVolume(int num){
        System.out.println("Stereo`s is setted to "+num+" in "+where);
    }
}
