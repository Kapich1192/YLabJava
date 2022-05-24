package com.YlabTasks.YlabTasks.lections.lesson4.Task8;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input first number: ");
        numbers.add(input.nextInt());
        System.out.println("Input second number: ");
        numbers.add(input.nextInt());
        System.out.println("Input third number: ");
        numbers.add(input.nextInt());
        System.out.println("Sorting numbers" + bubbleSort(numbers).toString());
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list){
        Integer temp;
        for(int i =0;i<list.size();i++){
            for(int j=i;j<list.size();j++){
                if(list.get(i)<list.get(j)){
                    temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }

    public static int[] bubbleSort(int[] array){
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
