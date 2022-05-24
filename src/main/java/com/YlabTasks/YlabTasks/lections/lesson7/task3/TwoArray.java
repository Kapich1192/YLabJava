package com.YlabTasks.YlabTasks.lections.lesson7.task3;

import java.io.*;

public class TwoArray {
    public static void main(String[] args)throws IOException {
        String[] arrayStrings = new String[10];
        int[] arrayNumbers = new int[10];
        for(int i=0;i<arrayStrings.length;i++){
            arrayStrings[i] = readString();
            arrayNumbers[i] = arrayStrings[i].length();
        }
        printArray(arrayNumbers);

    }
    public static String readString()throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
    public static void printArray(int[] array){
        for(int i:array){
            System.out.println(i);
        }
    }
}
