package com.YlabTasks.YlabTasks.lections.lesson5.Task7;

public class Cat {
    //static fields

    //fields
    private String name;
    private int age;
    private int weight;
    private String color;
    private String address;
    //constructors
    Cat(){}

    Cat(String name){
        this.name = name;
        weight = 1;
    }

    Cat(String name,int age){
        this.name = name;
        this.age = age;
        weight = 1;
    }
    Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    Cat(String name, int age, int weight,String color){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }
    Cat(String name, int age, int weight,String color,String address){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public int getWeight(){return weight;}
    public String getColor(){return color;}
    public String getAddress(){return address;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setWeight(int weight){this.weight = weight;}
    public void setColor(String color){this.color = color;}
    public void setAddress(String address){this.address = address;}
    //system
        //initialize
        public void initialize(String name){
            this.name = name;
            age = 1;
            weight = 1;
        }
        public void initialize(String name,String color){
        this.name = name;
        this.color = color;
        age = 1;
        weight =1;
        }
        public void initialize(String name,String color,String address){
        this.name = name;
        this.color = color;
        this.address = address;
        age = 1;
        weight = 1;
        }
        public void initialize(String name,int age){
        this.name = name;
        this.age = age;
        weight = 1;
        }
        public void initialize(){
        age = 1;
        weight = 1;
        }
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods
}
