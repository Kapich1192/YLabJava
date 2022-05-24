package com.YlabTasks.YlabTasks.lections.lesson8.task1;

import java.util.HashSet;
import java.util.Iterator;

public class SetOfPlants {
    public static void main(String[] args) {
        HashSet<String> plants = new HashSet<>(){{
            add("арбуз");add("банан");add("вишня");add("дыня");add("ежевика");
            add("жень-шень");add("земляника");add("груша");add("ирис");add("картофель");
        }};
        Iterator<String> it = plants.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String s:plants){
            System.out.println(s);
        }
    }
}
