package com.YlabTasks.YlabTasks.lections.lesson5.Task9;

public class Circle {
    //static fields

    //fields
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;
    //constructors
    Circle(){}
    //getters
    //setters
    //system
        //initialize
        public void initialize(int centerX,int centerY,int radius){
        this.centerX=centerX;
        this.centerY = centerY;
        this.radius = radius;
        }
        public void initialize(int centerX,int centerY,int radius,int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        }
        public void initialize(int centerX, int centerY,int radius,int width,String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.width =width;
        this.radius = radius;
        this.color = color;
        }
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods
}
