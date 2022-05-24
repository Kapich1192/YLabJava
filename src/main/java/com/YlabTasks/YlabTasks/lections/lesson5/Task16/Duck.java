package com.YlabTasks.YlabTasks.lections.lesson5.Task16;

public class Duck extends Animal{
    //static fields
    private static int duckCounter = 0;
    //fields
    private String name;
    private int age;
    private int weight;
    private Color color;

    //constructors
    public Duck(){
        duckCounter++;
    }
    public Duck(String name){
        this.name = name;
    }
    public Duck(String name,int age){
        this.name = name;
        this.age = age;
        duckCounter++;
    }
    public Duck(String name,int age,int weight){
        this.name =name;
        this.age = age;
        this.weight = weight;
        duckCounter++;
    }
    public Duck(String name,int age, int weight,Color color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        duckCounter++;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public Color getColor(){return color;}
    public static int getDuckCounter(){return duckCounter;}
    //setters

    //system
        //initialize
        //equals
        //hashcode
        //toString
        @Override
        public String toString() {
            return "Duck{" +
                "\n name='" + name + '\'' +
                ",\n age=" + age +
                ",\n weight=" + weight +
                ",\n color='" + color + '\'' +
                "\n}";
        }
        //finalize
    //methods
    //static methods
}
