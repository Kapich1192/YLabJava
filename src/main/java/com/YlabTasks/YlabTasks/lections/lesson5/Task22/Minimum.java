package com.YlabTasks.YlabTasks.lections.lesson5.Task22;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Input number1: ");
        list.add(input.nextInt());
        System.out.println("Input number2: ");
        list.add(input.nextInt());
        System.out.println("Input number3: ");
        list.add(input.nextInt());
        System.out.println("Input number4: ");
        list.add(input.nextInt());
        System.out.println("Input number5: ");
        list.add(input.nextInt());
        System.out.println("Min number = " + minElement(list));
    }
    public static int minElement(ArrayList<Integer> list){
        int temp = list.get(0);
        for(int i = 0;i<list.size();i++){
        if(temp>list.get(i))temp=list.get(i);
        }
        return temp;
    }
}
