package com.YlabTasks.YlabTasks.lections.lesson6.Task11;

import java.util.ArrayList;

public class Cat {
    //static fields
    public static ArrayList<Cat> cats = new ArrayList<>();
    //fields
    private String name = "No name";
    //constructors
    Cat(){
        cats.add(this);
    }
    Cat(String name){
        this.name = name;
        cats.add(this);
    }
    //system
        //toString
    @Override
    public String toString(){
        return "Cat{\nname = '" + name + "';\n}";
    }
}
