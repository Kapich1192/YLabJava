package com.YlabTasks.YlabTasks.lections.lesson8.task2;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(){{
            put("арбуз","ягода");put("банан","трава");put("вишня","ягода");put("груша","фрукт");put("дыня","овощ");
            put("ежевика","куст");put("жень-шень","корень");put("земляника","ягода");put("ирис","цветок");put("картофель","клубень");
        }};

        Iterator it = map.keySet().iterator();
        while(it.hasNext()){
            String s = String.valueOf(it.next());
            System.out.println(s + " " +  map.get(s));
        }
        for(String s: map.keySet()){
            System.out.println(s + " " + map.get(s));
        }
    }
}
