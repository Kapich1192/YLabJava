package com.YlabTasks.YlabTasks.lections.lesson6.Task10;

public class Cat {
    //static fields
    private static int catCounter = 0;
    //fields
    private String name;
    //constructors
    public Cat(){
        catCounter++;
    }
    public Cat(String name){
        this.name = name;
        catCounter++;
    }
    //getters
    public static int getCatCounter(){return catCounter;}
    public String getName(){return name;}

}
