package com.YlabTasks.YlabTasks.lections.lesson7.task19;

import java.io.*;
import java.util.*;

public class InputStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        ArrayList<String> list = new ArrayList<>();
            do{
                temp = reader.readLine();
                if(!temp.equals("end"))
                list.add(temp);
            }while(!temp.equals("end"));

        for(String s:list) {
            System.out.println(s);
        }
    }
}
