package com.YlabTasks.YlabTasks.lections.lesson8.task4;

import java.util.HashMap;
import java.util.Iterator;

public class PrintInConsole {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>()
        {{
           put("St1","One");put("St2","Two");put("St3","Three");put("St4","For");put("St5","Five");
           put("St6","Six");put("St7","Seven");put("St8","Eight");put("St9","Nine");put("St10","Ten");
        }};
        for(String s:map.keySet()){
            System.out.println(s);
        }
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
