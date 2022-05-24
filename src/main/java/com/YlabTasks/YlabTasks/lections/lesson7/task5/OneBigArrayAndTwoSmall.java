package com.YlabTasks.YlabTasks.lections.lesson7.task5;


import java.io.*;

public class OneBigArrayAndTwoSmall {
    public static void main(String[] args)throws IOException{
        int[] arrayBig = new int[20];
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for(int i = 0; i<arrayBig.length;i++){
            arrayBig[i] = inputInt();
        }
        for (int i = 0; i < array1.length; i++) {
            array1[i]=arrayBig[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=arrayBig[arrayBig.length/2 + i];
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }
    public static int inputInt()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

}
