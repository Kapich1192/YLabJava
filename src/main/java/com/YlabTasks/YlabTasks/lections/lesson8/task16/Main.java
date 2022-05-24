package com.YlabTasks.YlabTasks.lections.lesson8.task16;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>()
        {{
            put("Retrov","Semen");put("Serov","Vitaliy");put("Kapustin","Alexandr");put("Gladcov","Grigoriy");
            put("Liver","Anatoliy");put("Bromov","Semen");put("Zagooglin","Grigoriy");
            put("Krasnova","Svetlana");put("Lisichkina","Maria");put("Sharikova","Maria");
        }};
        HashMap<String,String> result = new HashMap<>();
        for(String s: map.keySet()){
            if(!result.containsValue(map.get(s))){
                result.put(s,map.get(s));
            }
        }
        map = result;
        for(String s:map.keySet()){
            System.out.println(s + " " + map.get(s));
        }
    }
}
