package com.YlabTasks.YlabTasks.lections.lesson8.task14;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>(){{
            put("Petrov","Vasiliy");put("Simonov","Kirill");put("Krakov","Ilia");
            put("Ivanova","Maria");put("Petrovkin","Semen");put("Zlatoust","Svetlana");
            put("Prohorov","Ilia");put("Zadornov","Andrey");put("Semenov","Andrey");
            put("Volkova","Maria");
        }};
        HashMap<String,Integer> res = countValue(map);
        for(String s:res.keySet()){
            System.out.println(s + " = " + res.get(s));
        }
    }
    public static HashMap<String,Integer>countValue(HashMap<String,String> map){
        HashMap<String,Integer> result = new HashMap<>();
        int temp;
        for(String s: map.keySet()){
            result.put(map.get(s),0);
        }
        for(String s: map.keySet()){
            temp = result.get(map.get(s));
            temp++;
            result.put(map.get(s),temp);
        }
        return result;
    }
}
