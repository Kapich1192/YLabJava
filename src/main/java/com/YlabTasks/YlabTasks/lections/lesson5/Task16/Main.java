package com.YlabTasks.YlabTasks.lections.lesson5.Task16;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Animal> map = new HashMap<>();
        map.put("duck1",new Duck("Skrudge",3,4,Color.RED));
        map.put("duck2",new Duck("Vasya",2,3,Color.BLACK));
        map.put("dog1",new Dog("Barbos",3,5,Color.WHITE));
        map.put("dog2",new Dog("Sharick",2,3,Color.BLACK));
        map.put("cat1",new Cat("Semen",3,4,Color.WHITE));
        map.put("cat2",new Cat("Maks",2,6,Color.WHITE));

        System.out.println(map.get("duck1").toString());
        System.out.println(map.get("duck2").toString());
        System.out.println(map.get("dog1").toString());
        System.out.println(map.get("dog2").toString());
        System.out.println(map.get("cat1").toString());
        System.out.println(map.get("cat2").toString());

        System.out.println("duckCounter = " + Duck.getDuckCounter());
        System.out.println("dogCounter = " + Dog.getDogCounter());
    }
}
