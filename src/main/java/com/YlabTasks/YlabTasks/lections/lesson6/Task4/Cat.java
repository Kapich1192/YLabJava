package com.YlabTasks.YlabTasks.lections.lesson6.Task4;

public class Cat {
    //static fields
    private static int catCounter = 0;
    //fields
    private String name;
    private int age;
    //constructors
    public Cat(){
        catCounter++;
    }
    public Cat(String name){
        this.name = name;
        catCounter++;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        catCounter++;
    }
    public Cat(Cat cat){
        name = cat.name;
        age = cat.age;
        catCounter++;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public static int getCatCounter(){return catCounter;}
    //setters
    public void setName(String name){this.name =name;}
    public void setAge(int age){this.age = age;}
    //system
        //initialize
        public void initialize(String name){
        this.name = name;
        }
        public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        }
        public void initialize(Cat cat){
        name = cat.name;
        age = cat.age;
        }
        //equals
        //hashcode
        //toString
    @Override
    public String toString(){
        return "Cat{\nname ='" + name +"',\nage = " + age+";\n}";
    }
        //finalize
    @Override
    protected void finalize() throws Throwable{
        System.out.println(this.getClass() + " destroyed.");
        catCounter--;
    }
}
