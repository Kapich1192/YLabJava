package com.YlabTasks.YlabTasks.lections.lesson3.Task4;

public class TheProductOfTenNumbers {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial(int f){
        int temp = 1;
        for(int i = 1;i <= f;i++){
         temp*=i;
        }
        return temp;
    }
}
