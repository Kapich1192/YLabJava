package com.YlabTasks.YlabTasks.lections.lesson4.Task21;

import java.util.Scanner;

public class EveryoneLovesMamba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = input.nextLine();
        printStr(10,name);
    }
    public static void printStr(int n,String s){
        for(int i = 0; i<n;i++){
            System.out.println(s + " любит меня.");
        }
    }
}
