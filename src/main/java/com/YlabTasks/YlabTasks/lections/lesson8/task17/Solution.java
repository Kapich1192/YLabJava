package com.YlabTasks.YlabTasks.lections.lesson8.task17;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
        HashSet<Cat> cats= Cat.createCats();
        Iterator<Cat> it = cats.iterator();
        cats.remove(it.next());
        Cat.printCats(cats);
    }
    //----
    public static class Cat{
        private String name;
        public Cat(){}
        public Cat(String name){this.name = name;}
        public String getName(){return name;}
        public void setName(String name){this.name = name;}
        public static HashSet<Cat> createCats(){
            HashSet<Cat> cats = new HashSet<>(){{
                add(new Cat("Vasia"));
                add(new Cat("Murka"));
                add(new Cat("Sonika"));
            }};
            return cats;
        }
        public static void printCats(HashSet<Cat> cats){
            for(Cat s:cats)
                System.out.println(s.toString());
        }
        @Override
        public String toString(){
            return "Cat{"+name+"}";
        }
    }
    //----
}
