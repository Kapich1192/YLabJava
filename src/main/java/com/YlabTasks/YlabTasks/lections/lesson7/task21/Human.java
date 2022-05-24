package com.YlabTasks.YlabTasks.lections.lesson7.task21;

public class Human {
    //fields
    private String name;
    private Sex sex;
    private int age;
    private Human father;
    private Human mother;
    //constructors
    public Human(){}
    public Human(String name){
        this.name = name;
    }
    public Human(String name,Sex sex){
        this.name = name;
        this.sex = sex;
    }
    public Human(String name, Sex sex,int age){
        this.name = name;
        this.sex = sex;
        this.age=age;
    }
    public Human(String name,Sex sex,int age,Human father){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
    }
    public Human(String name,Sex sex,int age,Human father,Human mother){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }
    //getters
    public String getName(){return name;}
    public Sex getSex(){return sex;}
    public int getAge(){return age;}
    public Human getFather(){return  father;}
    public Human getMother(){return mother;}
    //setters
    public void setName(String name){this.name =name;}
    public void setSex(Sex sex){this.sex = sex;}
    public void setAge(int age){this.age = age;}
    public void setFather(Human father){this.father =father;}
    public void setMother(Human mother){this.mother = mother;}
    //system
        //initialize
        //equals
        //hashcode
        //toString
    @Override
    public String toString(){
        if(father != null && mother == null)
        return "Human{\nname = '" + name+"',\nsex = '" + sex + "',\nage = " + age + ",\nfather = '" + father.getName()+ ";}";
        else if(father==null && mother != null)
            return "Human{\nname = '" + name+"',\nsex = '" + sex + "',\nage = " + age + ",\nmother = '" + mother.getName()+ ";}";
        else if(father!=null && mother != null)
            return "Human{\nname = '" + name+"',\nsex = '" + sex + "',\nage = " + age + ",\nmother = '" + mother.getName()+
                    ",\nfather = '" + father.getName()+ ";}";
        else return "Human{\nname = '" + name+"',\nsex = '" + sex + "',\nage = " + age + ";}";
    }
        //finalize
        @Override
        protected void finalize(){
        }
}
