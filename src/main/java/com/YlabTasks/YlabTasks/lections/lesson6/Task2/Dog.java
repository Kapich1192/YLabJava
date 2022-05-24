package com.YlabTasks.YlabTasks.lections.lesson6.Task2;

public class Dog {
    //static fields
    private static int dogCounter = 0;
    //fields
    private String name;
    private int age;
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
    public Dog(Dog dog){
        name = dog.name;
        age = dog.age;
        dogCounter++;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public static int getDogCounter(){return dogCounter;}
    //setters
    public void setName(String name){this.name = name;}
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
        public void initialize(Dog dog){
        name = dog.name;
        age = dog.age;
        }
        //equals
        //hashcode
        //toString
        @Override
    public String toString(){
        return "Dog{\nname = '" + name +"',\nage = " + age + ";\n}";
        }
        //finalize
    @Override
    protected void finalize()throws Throwable{
        System.out.println(this.getClass() + " destroyed.");
    }
    //methods
    //static methods
}
