package com.YlabTasks.YlabTasks.lections.lesson4.Task14;

import java.util.Scanner;

public class ThereIsNoSuchThingAsLotOfGood {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String string;
        int n;
        System.out.println("Введите строку: ");
        string = input.nextLine();
        System.out.println("Введите число: ");
        n = Integer.parseInt(input.nextLine());
        printString(string,n);

    }
    public static void printString(String s,int n){
        int i=0;
        while(i<n){
            System.out.println(s);
            i++;
        }
    }
}
