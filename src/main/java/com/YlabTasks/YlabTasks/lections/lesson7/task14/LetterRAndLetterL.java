package com.YlabTasks.YlabTasks.lections.lesson7.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class LetterRAndLetterL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<>(){{
        for(int i = 0; i<5;i++){
            add(reader.readLine());
        }
    }};
    list = fix(list);
    for(String s:list){
        System.out.println(s);
    }
    }

    public static ArrayList<String> fix(ArrayList<String> list){
        ArrayList<String> cop = new ArrayList<>();
        cop.addAll(list);
        for(String s:list){
            if(s.contains("л")&&!s.contains("р")){cop.add(s);}else
            if(s.contains("р")&&!s.contains("л")){cop.remove(s);}
        }
        return cop;
    }

}
