package com.YlabTasks.YlabTasks.lections.lesson4.Task25;

import java.util.Scanner;

public class MyNameIsVasya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int d,m,y;
        System.out.println("Input name: ");
        name = input.nextLine();
        System.out.println("Input year: ");
        y = Integer.parseInt(input.nextLine());
        System.out.println("Input month: ");
        m = Integer.parseInt(input.nextLine());
        System.out.println("Input day: ");
        d = Integer.parseInt(input.nextLine());
        System.out.println("My name is " + name + " I was born on" + d + "." + m + "." + y);
    }

}
