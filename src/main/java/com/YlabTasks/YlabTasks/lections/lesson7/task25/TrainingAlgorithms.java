package com.YlabTasks.YlabTasks.lections.lesson7.task25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TrainingAlgorithms {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>(){{
            for(int i =0;i<20;i++)add(Integer.parseInt(reader.readLine()));
        }};
        numbers = bubbleSort(numbers);

        for(Integer s:numbers)System.out.println(" " + s);
    }
    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
        int temp;
        for(int i=0;i< list.size();i++){
            for(int j =i;j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }

        return list;
    }
}
