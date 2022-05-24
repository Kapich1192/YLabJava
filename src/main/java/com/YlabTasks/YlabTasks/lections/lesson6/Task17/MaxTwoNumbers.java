package com.YlabTasks.YlabTasks.lections.lesson6.Task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxTwoNumbers {
    public static void main(String[] args) throws IOException{
        System.out.println("Input number1:");
        int a = readNumber();
        System.out.println("Input number2: ");
        int b = readNumber();
        System.out.println("Max = " +  max(a,b));
    }
    public static int readNumber()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
    public static int max(int a,int b){
        if(a>b)return a; else return b;
    }
}
