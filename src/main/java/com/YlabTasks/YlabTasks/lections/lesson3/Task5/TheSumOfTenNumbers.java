package com.YlabTasks.YlabTasks.lections.lesson3.Task5;

public class TheSumOfTenNumbers {
    public static void main(String[] args) {
        sumOfNumbers(10);
    }
    public static int sumOfNumbers(int num){
        int temp = 0;
        for (int i = 1;i<=num;i++){
            temp+=i;
            System.out.println(temp);
        }
        return temp;
    }
}
