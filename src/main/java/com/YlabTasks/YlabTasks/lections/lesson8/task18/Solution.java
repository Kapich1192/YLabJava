package com.YlabTasks.YlabTasks.lections.lesson8.task18;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        HashSet<Object> set = join(Cat.createCats(),Dog.createDogs());

        for(Object s:set){
            System.out.println(s.toString());
        }
        System.out.println("----------------");
        set = removeCats(set);
        for(Object s:set){
            System.out.println(s.toString());
        }
    }
    public static HashSet<Object> join(HashSet<Cat> set1,HashSet<Dog> set2){
        HashSet<Object> set = new HashSet<>(){{
            addAll(set1);addAll(set2);
        }};
        return set;
    }
    public static HashSet<Object> removeCats(HashSet<Object> set){
        HashSet<Object> set1 = new HashSet<>(){{addAll(set);}};
        for(Object s:set){
            if(s instanceof Cat )set1.remove(s);
        }
        return set1;
    }
//---------------------------------
    public static class Cat{
        private String name;
        public Cat(){}
    public Cat(String name){this.name = name;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public static HashSet<Cat> createCats(){
            return new HashSet<Cat>(){{
                add(new Cat("Markis"));
                add(new Cat("Vasiliy"));
                add(new Cat("Barsik"));
                add(new Cat("Pushok"));
            }};
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
//----------------------------------
    public static class Dog{
        private String name;

    public Dog(){}
    public Dog(String name){this.name = name;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public static HashSet<Dog> createDogs(){
        return new HashSet<>(){{
            add(new Dog("Rex"));
            add(new Dog("Barbos"));
            add(new Dog("Bax"));
        }};
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
//------------------------------------
}
