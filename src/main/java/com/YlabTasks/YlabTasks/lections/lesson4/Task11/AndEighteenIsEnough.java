package com.YlabTasks.YlabTasks.lections.lesson4.Task11;
import java.util.Scanner;
public class AndEighteenIsEnough {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Input name: ");
        name = input.nextLine();
        System.out.println("Input age: ");
        age = Integer.parseInt(input.nextLine());
        if(age>20)
            System.out.println("И 18-ти достаточно");
    }
}
