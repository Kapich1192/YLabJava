package com.YlabTasks.YlabTasks.lections.lesson5.Task14;

public class Circle {
    //fields
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;
    //constructors
    public Circle(){}
    public Circle(int centerX,int centerY,int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public Circle(int centerX,int centerY,int radius,int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }
    public Circle(int centerX,int centerY,int radius,int width,String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
    public Circle(Circle circle){
        centerX = circle.centerX;
        centerY = circle.centerY;
        radius = circle.radius;
        width = circle.width;
        color = circle.color;
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
