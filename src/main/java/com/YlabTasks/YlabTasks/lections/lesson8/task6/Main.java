package com.YlabTasks.YlabTasks.lections.lesson8.task6;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>(){{
            put("Key1",5);put("Key2",0.25);put("Key3","String");
            put("Key4",0.17);put("Key5","Vot Tak");
        }};

        for(String s:map.keySet()){
            System.out.println(s + " " + map.get(s));
        }
    }
}
