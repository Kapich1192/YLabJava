package com.YlabTasks.YlabTasks.lections.lesson5.Task10;

public class Rectangle {
    //static fields

    //fields
    private int top;
    private int left;
    private int width;
    private int height;
    //constructors
    //getters
    //setters
    //system
        //initialize
    public void initialize(int top,int left,int width , int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top,int left){
        this.top = top;
        this.left = left;
    }
    public void initialize(int top,int left,int width){
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }
    public void initialize(Rectangle rectangle){
        top = rectangle.top;
        left = rectangle.left;
        width = rectangle.width;
        height = rectangle.height;
    }
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods
}
