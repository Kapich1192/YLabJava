package com.YlabTasks.YlabTasks.lections.lesson7.task4;

import java.io.*;

public class ReplaceNumbersInArray {

    public static void main(String[] args) throws IOException{
        int[] numbers = new int[10];
        for(int i =0;i<numbers.length;i++){
            numbers[i] = readInt();
        }
        numbers = replaceNumbersInArray(numbers);
        printArray(numbers);
    }

    public static int readInt()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        return a;
    }

    public static int[] replaceNumbersInArray(int[] array){
        int[] temp = new int[array.length];
        for(int i = 0;i<temp.length;i++){
            temp[i]=array[array.length-i-1];
        }
        return temp;
    }

    public static void printArray(int[]array){
        for(int s:array){
            System.out.println(s);
        }
    }
}
