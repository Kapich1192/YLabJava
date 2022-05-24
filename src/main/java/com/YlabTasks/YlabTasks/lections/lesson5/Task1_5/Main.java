package com.YlabTasks.YlabTasks.lections.lesson5.Task1_5;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
        Cat catVasya = new Cat("Vasya",3,2,6);
        Cat catMateryi = new Cat("Materyi",5,4,7);
        Cat catLeopold = new Cat("Leopold",3,3,2);

catLeopold.sayHello();

        System.out.println("attack of the cat " + catVasya.getName() + " on the cat " + catLeopold.getName() + " completed " + catVasya.fight(catLeopold));
        System.out.println("attack of the cat " + catMateryi.getName() + " on the cat " + catLeopold.getName() + " completed " + catMateryi.fight(catLeopold));
        System.out.println("attack of the cat " + catMateryi.getName() + " on the cat " + catVasya.getName() + " completed " + catMateryi.fight(catVasya));

        Cat[] catsArray = new Cat[10];

        List<Pets> catsList = new ArrayList<>();
        catsList.add(new Dog("Vasia"));


//        add
//                size
//                get
//                        set
//                        isEmpty
//                                clear
//                                remove
//                                        toArray;

    }
}
