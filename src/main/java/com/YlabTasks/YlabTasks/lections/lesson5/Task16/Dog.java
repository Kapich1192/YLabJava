package com.YlabTasks.YlabTasks.lections.lesson5.Task16;

public class Dog extends Animal{
    //static fields
    private static int dogCounter = 0;
    //fields
    private String name;
    private int age;
    private int weight;
    private Color color;
    //constructors
    public Dog(){
        dogCounter++;
    }
    public Dog(String name){
        this.name = name;
        dogCounter++;
    }
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
        dogCounter++;
    }
    public Dog(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        dogCounter++;
    }
    public Dog(String name,int age,int weight,Color color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        dogCounter++;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public Color getColor(){return color;}
    public static int getDogCounter(){return dogCounter;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setWeight(int weight){this.weight = weight;}
    public void setColor(Color color){this.color = color;}
    //system
        //initialize
        //equals
        //hashcode
        //toString
        @Override
        public String toString(){
        return "Dog {\nname = '" + name +
                "',\nage = " + age +
                ",\nweight = " + weight +
                ",\ncolor = '" + color +
                "';\n}";
        }
        //finalize
    //methods
    //static methods
}
