package com.YlabTasks.YlabTasks.lections.lesson7.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TenStrings {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0;i<10;i++){
            list.add(0, reader.readLine());
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}
