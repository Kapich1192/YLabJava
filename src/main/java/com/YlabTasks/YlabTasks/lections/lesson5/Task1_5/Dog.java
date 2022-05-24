package com.YlabTasks.YlabTasks.lections.lesson5.Task1_5;

public class Dog extends Pets {
    //field
    private String name;
    private int age;
    //constructors
    public Dog(){}
    public Dog(String name){this.name = name;}
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}


    //system
    //methods
    //static methods
}
