package com.YlabTasks.YlabTasks.lections.lesson7.task6;

import java.util.ArrayList;

public class FiveStringInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>()
        {{
            add("One");add("Two");add("Tree");add("Four");add("Five");
        }};
        System.out.println("List length = " + list.size());
        for(String s:list){
            System.out.println(s);
        }
    }
}
