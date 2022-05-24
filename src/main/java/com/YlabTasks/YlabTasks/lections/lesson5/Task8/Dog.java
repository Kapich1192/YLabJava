package com.YlabTasks.YlabTasks.lections.lesson5.Task8;

public class Dog {
    //static fields

    //fields
    private String name;
    private int height;
    private String color;
    //constructors
    public Dog(){}
    public Dog(String name){
        this.name = name;
    }
    public Dog(String name, int height){
        this.name = name;
        this.height = height;
    }
    public Dog(String name, int height,String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }
    //getters
    public String getName(){return name;}
    public int getHeight(){return height;}
    public String getColor(){return color;}
    //setters
    public void setName(String name){this.name = name;}
    public void setHeight(int height){this.height = height;}
    public void setColor(String color){this.color = color;}
    //system
        //initialize
        public void initialize(){
        height = 1;
        }
        public void initialize(String name){
        this.name = name;
        height = 1;
        }
        public void initialize(String name, int height){
        this.name = name;
        this.height = height;
        }
        public void initialize(String name, int height,String color){
        this.name = name;
        this.height = height;
        this.color = color;
        }
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods
}
