package com.YlabTasks.YlabTasks.lections.lesson7.task24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InputStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String>list = new ArrayList<>();
        String temp;
        for(;;){
            temp = reader.readLine();
            if(temp.length()>0)list.add(temp);
            else break;
        }
        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()%2 == 0){
                list2.add(list.get(i)+" "+list.get(i));
            }else{
                list2.add(list.get(i)+" "+list.get(i)+" "+list.get(i));
            }
        }
        for(String s:list2){
            System.out.println(s);
        }
    }
}
