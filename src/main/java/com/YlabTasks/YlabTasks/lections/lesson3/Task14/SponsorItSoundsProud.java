package com.YlabTasks.YlabTasks.lections.lesson3.Task14;

import java.util.Scanner;

public class SponsorItSoundsProud {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name1,name2;
        System.out.println("Введите первое имя: ");
        name1 = input.nextLine();

        System.out.println("Введите второе имя: ");
        name2 = input.nextLine();

        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
    }
}
