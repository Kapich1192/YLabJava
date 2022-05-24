package com.YlabTasks.YlabTasks.lections.lesson3.Task8;

public class RainbowColor {
    //field
    public enum Color{Red,Orange,Yellow,Green,SkyBlue,Blue,Fillet}
    private Color color;
    RainbowColor(Color color){
        this.color = color;
    }
    @Override
    public String toString(){
        return color.toString();
    }

}
