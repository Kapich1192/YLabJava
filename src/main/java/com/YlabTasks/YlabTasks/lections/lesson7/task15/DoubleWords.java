package com.YlabTasks.YlabTasks.lections.lesson7.task15;
import java.util.*;
import java.io.*;

public class DoubleWords {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>(){{
            for(int i =0;i<10;i++)
            add(reader.readLine());
        }};
        list = doubleValue(list);
        for(String s:list){
            System.out.println(s);
        }
    }
    public static ArrayList doubleValue(ArrayList list){
        ArrayList cop = new ArrayList();
        for(var s:list){
            cop.add(s);
            cop.add(s);
        }
        return cop;
    }
}
