package com.YlabTasks.YlabTasks.lections.lesson5.Task18;

public class Mouse {
    //static fields
    private int mouseCounter = 0;
    //fields
    private String name;
    private int height;
    private int age;
    //constructors
    public Mouse(){
        mouseCounter++;
    }
    public Mouse(String name){
        this.name = name;
        mouseCounter++;
    }
    public Mouse(String name,int age){
        this.name = name;
        this.age = age;
        mouseCounter++;
    }
    public Mouse(String name,int age,int height){
        this.name = name;
        this.age = age;
        this.height = height;
        mouseCounter++;
    }
    public Mouse(Mouse mouse){
        name = mouse.name;
        age = mouse.age;
        height = mouse.height;
    }
}
