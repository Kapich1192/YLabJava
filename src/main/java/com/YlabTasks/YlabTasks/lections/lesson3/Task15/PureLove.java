package com.YlabTasks.YlabTasks.lections.lesson3.Task15;

import java.util.Scanner;

public class PureLove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1,name2,name3;
        System.out.println("Введите первое имя: ");
        name1 = input.nextLine();
        System.out.println("Введите второе имя: ");
        name2 = input.nextLine();
        System.out.println("Введите третье имя: ");
        name3 = input.nextLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да! ");
    }
}
