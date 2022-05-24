package com.YlabTasks.YlabTasks.lections.lesson8.task3;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Cat> cats = new HashMap<>()
        {{
            put("Vasia",new Cat("Vasia"));
            put("Shuha",new Cat("Shuha"));
            put("Ghugha",new Cat("Ghugha"));
            put("Barsik",new Cat("Barsik"));
            put("Pushok",new Cat("Pushok"));
            put("Mashka",new Cat("Mashka"));
            put("Bax",new Cat("Bax"));
            put("Jack",new Cat("Jack"));
            put("Sima",new Cat("Sima"));
            put("Nuka",new Cat("Nuka"));
        }};
        for(String s:cats.keySet()){
            System.out.println(cats.get(s).getName());
        }
        Iterator it = cats.keySet().iterator();
        while(it.hasNext()){
            System.out.println(cats.get(it.next()).getName());
        }
    }
}
