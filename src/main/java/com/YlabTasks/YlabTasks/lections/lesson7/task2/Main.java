package com.YlabTasks.YlabTasks.lections.lesson7.task2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        int[] array = new int[10];
        for(int i = 0; i < 8;i++){
            array[i] = readInt();
        }
        printArray(array);
    }
    public static int readInt()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        return a;
    }
    public static void printArray(int[] array){
        for(int i = array.length - 1; i>=0;i--){
        System.out.println(array[i]);
        }
    }
}
