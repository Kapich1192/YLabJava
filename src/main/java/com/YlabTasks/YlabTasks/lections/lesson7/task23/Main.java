package com.YlabTasks.YlabTasks.lections.lesson7.task23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Cat> cats = new ArrayList<>();
        String temp = "yes";
        while(!temp.equals("no")){
            System.out.println("Input cat?");
            temp = reader.readLine();
            if(!temp.equals("no"))Cat.addCat(cats);
        }
        for(Cat s:cats)
        System.out.println(s.toString());
    }
}
