package com.YlabTasks.YlabTasks.lections.lesson3.Task11;

import java.util.Scanner;

public class HowToTakeOverTheWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int year;
        System.out.println("Введите имя: ");
        name = input.nextLine();
        System.out.println("Введите количество лет: ");
        year = Integer.parseInt(input.nextLine());
        System.out.println(name + " захватит мир через " + year +" лет. Му-ха-ха!");
    }
}
