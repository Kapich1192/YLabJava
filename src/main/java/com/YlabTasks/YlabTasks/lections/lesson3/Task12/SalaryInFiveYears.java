package com.YlabTasks.YlabTasks.lections.lesson3.Task12;

import java.util.Scanner;

public class SalaryInFiveYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int num1,num2;
        System.out.println("Введите имя: ");
        name = input.nextLine();
        System.out.println("Введите число1: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Введите число2: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
