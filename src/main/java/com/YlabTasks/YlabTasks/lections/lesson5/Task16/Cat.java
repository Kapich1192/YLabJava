package com.YlabTasks.YlabTasks.lections.lesson5.Task16;

public class Cat extends Animal{
    //static fields
    private static int catCounter = 0;
    //fields
    private String name;
    private int age;
    private int weight;
    private Color color;
    //constructors
    public Cat(){
        catCounter++;
    }
    public Cat(String name){
        this.name = name;
        catCounter++;
    }
    public Cat(String name,int age,int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        catCounter++;
    }
    public Cat(String name,int age,int weight,Color color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        catCounter++;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public Color getColor(){return color;}
    public static int getCatCounter(){return catCounter;}
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
        return "Cat{" +
                "\nname = '" + name +
                "',\nage = " + age +
                ",\nweight = " + weight +
                ",\ncolor = '" + color +
                "';\n}";
        }
        //finalize
    //methods
    //static methods

}
