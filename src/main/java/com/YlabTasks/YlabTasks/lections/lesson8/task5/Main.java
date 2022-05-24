package com.YlabTasks.YlabTasks.lections.lesson8.task5;

import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>(){{
           put("Key1","Value1");put("Key2","Value2");put("Key3","Value3");put("Key4","Value4");
           put("Key5","Value5");put("Key6","Value6");put("Key7","Value7");
           put("Key8","Value8");put("Key9","Value9");put("Key10","Value10");
        }};
        for(String s: map.keySet()){
            System.out.println(map.get(s));
        }
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }
    }
}
