package com.YlabTasks.YlabTasks.lections.lesson4.Task6;

import java.util.Scanner;

public class MinimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Введите первое число: ");
        a = input.nextInt();
        System.out.println("Введите второе число: ");
        b = input.nextInt();
        System.out.println("Меньшее число = " + min(a,b));
    }
    public static int min(int a,int b){
        if ( a > b)return b; else return a;
    }
}
