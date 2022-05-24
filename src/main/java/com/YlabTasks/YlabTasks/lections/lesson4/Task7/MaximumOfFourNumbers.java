package com.YlabTasks.YlabTasks.lections.lesson4.Task7;

import java.util.Scanner;

public class MaximumOfFourNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Введите первое число: ");
        a = input.nextInt();
        System.out.println("Введите второе число: ");
        b=input.nextInt();
        System.out.println("Введите третье число: ");
        c=input.nextInt();
        System.out.println("Введите четвертое число: ");
        d=input.nextInt();
        System.out.println("Максимальное из всех чисел = " + max(a,b,c,d));
    }
    public static int max(int a,int b){
        if(a>b)return a; else return b;
    }
    public static int max(int a, int b, int c, int d){
        return max(max(a,b),max(c,d));
    }
}
