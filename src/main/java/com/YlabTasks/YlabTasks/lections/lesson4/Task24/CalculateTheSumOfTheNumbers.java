package com.YlabTasks.YlabTasks.lections.lesson4.Task24;
import java.util.Scanner;
public class CalculateTheSumOfTheNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0,temp = 0;
        while(temp != (-1)){
            System.out.println("Введите число или -1 для выхода");
            temp = input.nextInt();
            sum +=temp;
        }
        System.out.println("сумма введенных равна: " + sum);
    }
}
