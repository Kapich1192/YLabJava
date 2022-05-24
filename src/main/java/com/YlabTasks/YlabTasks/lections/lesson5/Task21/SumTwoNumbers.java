package com.YlabTasks.YlabTasks.lections.lesson5.Task21;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1,num2,sum;
        System.out.println("Input number1: ");
        num1 = console.nextInt();
        System.out.println("Input number2: ");
        num2 = console.nextInt();
        sum = num1+num2;
        System.out.println("sum = " + sum);
    }
}
