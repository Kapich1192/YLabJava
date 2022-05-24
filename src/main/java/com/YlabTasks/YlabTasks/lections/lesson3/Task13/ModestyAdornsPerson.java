package com.YlabTasks.YlabTasks.lections.lesson3.Task13;

import java.util.Scanner;

public class ModestyAdornsPerson  {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
       String name;
       int salary;
        System.out.println("Введите имя: ");
        name = console.nextLine();
        System.out.println("Введите число: ");
        salary = Integer.parseInt(console.nextLine());
        System.out.println(name + " зарабатывает $" + salary + ". Ха-ха-ха!");
    }
}
