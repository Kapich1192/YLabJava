package com.YlabTasks.YlabTasks.lections.lesson7.task1;
import java.io.*;
public class MaxNumberInArray {
    public static void main(String[] args)throws IOException {
        int[] array = initializeArray();
        System.out.println(maxElementInArray(array));
    }
    public static int[] initializeArray()throws IOException{
        int[] array = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i<array.length;i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
    public static int maxElementInArray(int[] array){
        int temp = array[0];
        for(int i = 0; i<array.length;i++){
            if(temp < array[i])temp = array[i];
        }
        return temp;
    }
}
