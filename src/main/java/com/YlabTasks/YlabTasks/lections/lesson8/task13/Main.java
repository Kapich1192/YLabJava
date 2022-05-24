package com.YlabTasks.YlabTasks.lections.lesson8.task13;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(){{
            for(int i = 1;i<=20;i++)
                add(i);
        }};
        HashSet<Integer> set1 = new HashSet<>();
        set1.addAll(set);
        for(Integer s:set){
            if(s>10)set1.remove(s);
        }
        set = set1;
        for(Integer s:set){
            System.out.println(s);
        }
    }
}
