package com.YlabTasks.YlabTasks.lections.lesson8.task15;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Date> map = new HashMap<>()
        {{
            put("Petrov",new Date(2000,6,7));
            put("Serov",new Date(2005,7,7));
            put("Ivanov",new Date(1975,5,7));
            put("Zelenov",new Date(1989,3,7));
            put("Tihonov",new Date(1992,5,7));
            put("Karasev",new Date(2003,9,7));
            put("Kurochkin",new Date(2001,8,7));
            put("Vasechkin",new Date(1999,11,7));
            put("Leprikonov",new Date(2011,2,7));
            put("Hrenov",new Date(2003,2,7));
            put("Volkov",new Date(2001,3,7));
        }};
        HashMap<String,Date> mapK = new HashMap<>();
        mapK.putAll(map);

        for(String s:map.keySet()){
            if(map.get(s).getMonth()==5 || map.get(s).getMonth()==6 ||map.get(s).getMonth()==7 )
                mapK.remove(s);
        }
        map = mapK;
        for(String s:map.keySet()){
            System.out.println(s);
        }
    }
}
