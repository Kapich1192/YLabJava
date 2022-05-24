package com.YlabTasks.YlabTasks.lections.lesson7.task22;

import java.util.ArrayList;

public class ChoiceSorting {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(){{
            for(int i =0;i<10;i++){
                add((int)(Math.random()*100));
            }
        }};
        for(Integer s:list){
            System.out.print(" "+s);
        }
        System.out.println("");
        list = choiceSort(list);
        for(Integer s:list){
            System.out.print(" "+s);
        }
        System.out.println("");
        int[] array = new int[10];
        for(int i =0;i<array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
        for(int s:array){
            System.out.print(" " + s);
        }
        choiceSort(array);
        System.out.println("");
        for(int s:array){
            System.out.print(" " + s);
        }

    }
    public static int[] choiceSort(int[] array){
        for(int i = 0;i<array.length;i++){
            swap(array,i,maxIndex(array,i));
        }
        return array;
    }
    public static ArrayList<Integer> choiceSort(ArrayList<Integer> list){
        for(int i = 0;i< list.size();i++){
            swap(list,i,maxIndex(list,i));
        }
        return list;
    }

    public static void swap(int[]array,int index1,int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void swap(ArrayList<Integer> list,int index1,int index2){
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }

    public static int maxIndex(int[]array,int startIndex){
        int max = startIndex;
        for(int i = startIndex;i<array.length;i++)
        if(array[max]<array[i])max=i;
        return max;
    }
    public static int maxIndex(ArrayList<Integer> list,int startIndex){
        int max = startIndex;
        for(int i = startIndex;i<list.size();i++)
            if(list.get(max)<list.get(i))max=i;
        return max;
    }
}
