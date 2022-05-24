package com.YlabTasks.YlabTasks.lections.lesson7.task12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Words {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5;i++){
            list.add(reader.readLine());
        }
        list.remove(2);
        for(String s:list){
            System.out.println(s);
        }
    }
}
