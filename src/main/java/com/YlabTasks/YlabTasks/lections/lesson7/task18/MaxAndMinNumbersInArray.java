package com.YlabTasks.YlabTasks.lections.lesson7.task18;

import java.io.*;

public class MaxAndMinNumbersInArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for(int i = 0;i<array.length;i++){
        array[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println(max(array) + " " + min(array));
    }
    public static int max(int[]array){
        int temp=array[0];
        for(int i:array){
            if(i>temp)temp=i;
        }
        return temp;
    }
    public static int min(int[]array){
        int temp = array[0];
        for(int i:array){
            if(temp>i)temp=i;
        }
        return temp;
    }
}
