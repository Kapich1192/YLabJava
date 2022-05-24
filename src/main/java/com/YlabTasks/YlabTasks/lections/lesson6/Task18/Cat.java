package com.YlabTasks.YlabTasks.lections.lesson6.Task18;

public class Cat {
    private String name;
    private String father = "no father";
    private String mother = "no mother";

    public Cat(){}

    public Cat(String name){
        this.name = name;
    }
    public Cat(String name,String father,String mother){
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public String getName(){return name;}
    public String getFather(){return father;}
    public String getMother(){return mother;}

    public void setName(String name){this.name = name;}
    public void setFather(String father){this.father = father;}
    public void setMother(String mother){this.mother = mother;}

}
