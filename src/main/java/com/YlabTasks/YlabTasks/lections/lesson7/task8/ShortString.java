package com.YlabTasks.YlabTasks.lections.lesson7.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortString {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5;i++){
            list.add(reader.readLine());
        }
        int temp = list.get(0).length();
        for(String s:list){
            if(s.length()<temp)temp = s.length();
        }
        for(String s:list){
            if(s.length()==temp)System.out.println(s);
        }
    }
}
