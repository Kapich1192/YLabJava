package com.YlabTasks.YlabTasks.lections.lesson4.Task23;
import java.util.ArrayList;
import java.util.Scanner;
public class TheAverageIsSuchAnAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Input first number: ");
        a = input.nextInt();
        System.out.println("Input second number: ");
        b = input.nextInt();
        System.out.println("Input third number: ");
        c = input.nextInt();
        System.out.println("Average number is " + averageNumber(a,b,c));
    }
    public static int averageNumber(int a, int b,int c){
            ArrayList<Integer> list = new ArrayList<>(){{
                add(a);add(b);add(c);
            }};
            choiceSort(list);
            return list.get(1);
    }
    public static ArrayList<Integer> choiceSort(ArrayList<Integer> list){
        int temp,index;
        for(int i = 0; i<list.size();i++){
            index = minElementIndex(list,i);
            temp = list.get(i);
            list.set(i,list.get(index));
            list.set(index,temp);
        }
        return list;
    }
    public static int minElementIndex(ArrayList<Integer> list,int startIndex){
        int indexMin = startIndex ;
        for(int i = startIndex;i<list.size();i++){
            if(list.get(i)<list.get(indexMin))indexMin=i;
        }
        return indexMin;
    }

}
