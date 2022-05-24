package com.YlabTasks.YlabTasks.lections.lesson5.Task6;

public class Friend {
    //static field

    //field
    private String name;
    private int age;
    private String sex;
    //constructors
    Friend(){}

    Friend(String name){this.name = name;}

    Friend(String name,int age){
        this.name = name;
        this.age = age;
    }

    Friend(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    //getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getSex(){return sex;}
    //setters
    public void setName(String name){this.name = name;}
    public void setAge(int age){this.age = age;}
    public void setSex(String sex){this.sex = sex;}
    //system
        //initialize
        public void initialize(String name){
        this.name = name;
        }
        public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        }
        public void initialize(String name, int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
        }
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods
}
