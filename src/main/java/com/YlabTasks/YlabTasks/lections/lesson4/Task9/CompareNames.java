package com.YlabTasks.YlabTasks.lections.lesson4.Task9;

import java.util.Scanner;

public class CompareNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1,name2;
        System.out.println("Input first name: ");
        name1= input.nextLine();
        System.out.println("Input second name: ");
        name2= input.nextLine();

        if(name1.equals(name2)){
            System.out.println("Имена идентичны");
        }
        else
        if(name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }

    }
}
