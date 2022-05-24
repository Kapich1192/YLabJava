package com.YlabTasks.YlabTasks.lections.lesson6.Task6;

public class Cat {
    //static fields
    private static int catCount =0;
    //fields
    private String name;
    //constructors
    public Cat(){
        catCount++;
    }
    //getters
    public String getName(){return name;}
    public static int getCatCount(){return catCount;}
    //setters
    public void setName(String name){this.name = name;}
    public static void setCatCount(int number){catCount = number;}
    //system
        //initialize
    public void initialize(String name){
        this.name = name;
    }
    public void initialize(Cat cat){
        name = cat.name;
    }
        //equals
        //hashcode
        //toString
    @Override
    public String toString(){
        return"Cat{\nname = '" + name + "';\n}";
    }
        //finalize
    @Override
    protected void finalize() throws Throwable{
        System.out.println(this.getClass() + " destroyed.");
    }
    //method
    //static methods
}
