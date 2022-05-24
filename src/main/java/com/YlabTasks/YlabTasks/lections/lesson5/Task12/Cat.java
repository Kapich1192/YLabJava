package com.YlabTasks.YlabTasks.lections.lesson5.Task12;

public class Cat {
    //fields
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;
    //constructors
    public Cat(){}
    public Cat(String name){
        this.name = name;
        age = 1;
        weight = 1;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        weight =1;
    }
    public Cat(String name, int age,int weight){
        this.name = name;
        this.age  = age;
        this.weight = weight;
    }
    public Cat(String name, int age,int weight,String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    public Cat(String name,int age, int weight,String color,String address){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public Cat(Cat cat){
        name = cat.name;
        age = cat.age;
        weight = cat.weight;
        color = cat.color;
        address = cat.address;
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
