package com.YlabTasks.YlabTasks.lections.lesson4.Task10;

import java.util.Scanner;

public class EighteenPlus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Input name: ");
        name = input.nextLine();
        System.out.println("Input age: ");
        age = Integer.parseInt(input.nextLine());
        if(age<18)
            System.out.println("Подрасти еще");
    }
}
