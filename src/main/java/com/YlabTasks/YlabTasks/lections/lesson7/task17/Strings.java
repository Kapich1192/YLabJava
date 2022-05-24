package com.YlabTasks.YlabTasks.lections.lesson7.task17;
import java.io.*;
import java.util.*;

public class Strings {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()),
            M = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>(){{
            for(int i =0;i<N;i++){
                add(reader.readLine());
            }
        }};
        for(int i = 0;i<M;i++){
            list.add(list.get(0));
            list.remove(0);
        }
        for(String s:list){
            System.out.println(s);
        }
    }
}
