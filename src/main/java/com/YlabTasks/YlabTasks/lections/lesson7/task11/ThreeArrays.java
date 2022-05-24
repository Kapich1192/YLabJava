package com.YlabTasks.YlabTasks.lections.lesson7.task11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThreeArrays {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> bigList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        BufferedReader  reader= new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20;i++){
            System.out.println("Input number:");
            bigList.add(Integer.parseInt(reader.readLine()));
        }
        for(int i =0;i<bigList.size();i++){
            if(bigList.get(i)%2==0){
                list1.add(bigList.get(i));
            }
            if(bigList.get(i)%3==0){
                list2.add(bigList.get(i));
            }
            if(bigList.get(i)%3!=0 && bigList.get(i)%2!=0){
                list3.add(bigList.get(i));
            }
        }
        printList(list2);
        printList(list1);
        printList(list3);
    }
    public static void printList(ArrayList list){
        for (var s:list){
            System.out.println(s);
        }
    }
}
