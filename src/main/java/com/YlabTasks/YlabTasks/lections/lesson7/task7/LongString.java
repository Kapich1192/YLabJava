package com.YlabTasks.YlabTasks.lections.lesson7.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LongString {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<5;i++)
        list.add(reader.readLine());
        int len =0;
        for(String s:list){
            if(s.length()>len)len=s.length();
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() ==len)
                System.out.println(list.get(i));
        }
    }
}
