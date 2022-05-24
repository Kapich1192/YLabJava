package com.YlabTasks.YlabTasks.lections.lesson6.Task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FiveNumbers {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Input number " + i + ": ");
            numbers.add(readNumber());
        }

        System.out.println("Numbers : ");
        sort(numbers);
        for(Integer s:numbers){
            System.out.println(s);
        }
    }
    public static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> list){
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(list.get(i)>list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
}
