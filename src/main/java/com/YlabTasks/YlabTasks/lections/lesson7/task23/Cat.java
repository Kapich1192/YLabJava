package com.YlabTasks.YlabTasks.lections.lesson7.task23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int tail;
    //constructors
    public Cat(){}
    public Cat(String name){
        this.name = name;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat(String name,int age,int weight,int tail){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.tail = tail;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public int getTail(){return tail;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setWeight(int weight){this.weight = weight;}
    public void setTail(int tail){this.tail = tail;}
    //toString
    @Override
    public String toString(){
        return"Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tail;
    }
    //static methods
    public static void addCat(ArrayList<Cat> cats)throws IOException {
        BufferedReader reader = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println("Input name cat, age, weight, tail");
        cats.add(new Cat(
                reader.readLine(),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine())
        ));
    }
}
