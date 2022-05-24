package com.YlabTasks.YlabTasks.lections.lesson5.Task18;

public class Cat {
    //static fields
    private int catCounter = 0;
    //fields
    private String name;
    private int age;
    private int height;
    //constructors
    Cat(){
        catCounter++;
    }
    Cat(String name){
        this.name = name;
        catCounter++;
    }
    Cat(String name,int age,int height){
        this.name = name;
        this.age = age;
        this.height = height;
        catCounter++;
    }
    Cat(Cat cat){
        name = cat.name;
        age = cat.age;
        height = cat.height;
        catCounter++;
    }
}
