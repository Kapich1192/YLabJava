package com.YlabTasks.YlabTasks.lections.lesson5.Task20;

import java.util.Scanner;

public class EnterNumbersFromTheKeyboardAndCountTheirSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp;
        int sum = 0;
        do{
            System.out.println("input number or input sum for exit: ");
            temp = input.nextLine();
            if(!temp.equals("sum"))
                sum+=Integer.parseInt(temp);
        }while(!temp.equals("sum"));
        System.out.println("sum = " + sum + ";");
    }
}
