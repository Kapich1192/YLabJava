package com.YlabTasks.YlabTasks.lections.lesson5.Task1_5;

public class Cat extends Pets {
    //static fields
    private static int catCounter = 0;
    //field
    private String name;
    private int age;
    private int weight;
    private int strength;
    //constructors
    public Cat(){
        catCounter++;
    }
    public Cat(String name){
        this.name = name;
    catCounter++;
    }
    public Cat(String name,int age,int weight,int strength){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }
    //getters
    @Override
    public String getName(){return name;}

    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public int getStrength(){return strength;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setWeight(int weight){this.weight = weight;}
    public void setStrength(int strength){this.strength = strength;}
    //system
    //methods
    public boolean fight(Cat anotherCat){
        int cat1Power,cat2Power;
        cat1Power = age + weight + strength;
        cat2Power = anotherCat.getAge()+ anotherCat.getStrength()+ anotherCat.getWeight();
        if(cat1Power>cat2Power)
        return true; else return false;
    }
    public void eat(String product){
        System.out.println("Miay i am eat " + product);
    }
    //static methods
    public static void clearHome(Cat cat){

    }

}
