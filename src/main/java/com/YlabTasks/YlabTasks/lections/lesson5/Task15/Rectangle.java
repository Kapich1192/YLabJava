package com.YlabTasks.YlabTasks.lections.lesson5.Task15;

public class Rectangle {
    //fields
    private int top;
    private int left;
    private int width;
    private int height;
    //constructors
    public Rectangle(){}
    public Rectangle(int top, int left,int width,int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top,int left){
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left,int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }
    public Rectangle(Rectangle rectangle){
        top = rectangle.top;
        left = rectangle.left;
        width = rectangle.width;
        height = rectangle.height;
    }
    //getters
    //setters
    //system
        //initialize
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods

}
