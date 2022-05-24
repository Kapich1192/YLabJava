package com.YlabTasks.YlabTasks.lections.lesson5.Task13;

public class Dog {
    //fields
    private String name;
    private int height;
    private String color;
    //constructors
    public Dog(){}
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name,int height){
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height,String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public Dog(Dog dog){
        name = dog.name;
        height = dog.height;
        color = dog.color;
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
