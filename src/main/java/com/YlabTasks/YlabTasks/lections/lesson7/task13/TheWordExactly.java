package com.YlabTasks.YlabTasks.lections.lesson7.task13;

import java.util.ArrayList;

public class TheWordExactly {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("мама");add("именно");add("мыла");add("именно");add("раму");add("именно");
        }};
        for(String s:list){
            System.out.println(s);
        }
    }
}
