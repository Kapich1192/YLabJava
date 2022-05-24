package com.YlabTasks.YlabTasks.lections.lesson5.Task17;

public class Solution {
    public static class Women{
        String name;
        int age;
        String address;
        Women(){}
        Women(String name){
            this.name = name;
        }
        Women(String name,int age){
            this.name = name;
            this.age = age;
        }
        Women(String name,int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        Women(Women women){
            name = women.name;
            age = women.age;
            address = women.address;
        }
        @Override
        public String toString(){
            return "Women{\nname = '" + name + "',\nage = " + age + ",\naddress = '" + address + "';\n}";
        }
    }
    public static class Man{
        String name;
        int age;
        String address;
        Man(){}
        Man(String name){
            this.name = name;
        }
        Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        Man(String name,int age,String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        Man(Man man){
            name = man.name;
            age = man.age;
            address = man.address;
        }
        @Override
        public String toString(){
            return "Man{\nname = '" + name + "',\nage = " + age + ",\naddress = '" + address + "';\n}";
        }

    }
    public static void main(String[] args){
        Women women = new Women("Maria",36,"Russia,Moscow");
        Women women2 = new Women("Karina",25,"Russia, Magadan");
        System.out.println(women.toString());
        System.out.println(women2.toString());
        Man man = new Man("Vova",54,"Russia,Dmitrov");
        Man man2 = new Man("Ilia",23,"Russia, Krasnoyarsk");
        System.out.println(man.toString());
        System.out.println(man2.toString());
    }
}
