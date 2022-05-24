package com.YlabTasks.YlabTasks.lections.lesson6.Task1;

public class Cat {
    //static fields
    private int catCount = 0;
    //fields
    private String name;
    private int age;
    //constructors
    public Cat(){
        catCount++;
    }
    public Cat(String name){
        this.name = name;
        catCount++;
    }
    public Cat(String name,int age){
        this.name = name;
        this.age = age;
        catCount++;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    //system
        //initialize
        public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        }
        //equals
        //hashcode
        //toString
        @Override
        public String toString(){
        return "Cat{\nname = '" + name + "',\nage = "+ age+";\n}" ;
        }
        //finalize
        @Override
        protected void finalize() throws Throwable{
            System.out.println(this.getClass() + " destroyed");
        }
}
