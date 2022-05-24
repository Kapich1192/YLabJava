package com.YlabTasks.YlabTasks.lections.lesson7.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteLastStringAndAddHisInBeginning {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list =new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<5;i++){
            list.add(reader.readLine());
        }
        String temp = list.get(0);
        list.set(0,list.get(4));
        list.set(4,temp);
    }
}
