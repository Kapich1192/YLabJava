package com.YlabTasks.YlabTasks.lections.lesson5.Task23;

import java.util.ArrayList;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n;
        System.out.println("Input number n: ");
        n = input.nextInt();
        for(int i =1;i<=n;i++){
            System.out.println("input number" + i+": ");
            list.add(input.nextInt());
        }
        System.out.println("Max number = " + maxElement(list)+";");
    }
    public static int maxElement(ArrayList<Integer> list){
        int temp = list.get(0);
        for(int i = 0;i<list.size();i++){
            if(temp<list.get(i))temp=list.get(i);
        }
        return temp;
    }
}
