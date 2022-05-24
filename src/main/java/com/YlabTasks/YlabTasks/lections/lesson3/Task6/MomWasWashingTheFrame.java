package com.YlabTasks.YlabTasks.lections.lesson3.Task6;

import java.util.ArrayList;


public class MomWasWashingTheFrame {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){{
            add("Мама");add("Мыла");add("Раму");
        }};
        System.out.println(list.get(0)+list.get(1)+list.get(2));
        System.out.println(list.get(0)+list.get(2)+list.get(1));
        System.out.println(list.get(2)+list.get(1)+list.get(0));
        System.out.println(list.get(2)+list.get(0)+list.get(1));
        System.out.println(list.get(1)+list.get(0)+list.get(2));
        System.out.println(list.get(1)+list.get(2)+list.get(0));
    }

//    public static void printAllVariantsSet(ArrayList<String> list){
//        String temp = "";
//        HashSet<String> variants = new HashSet<>();
//
//        for (int i = 0; i < factorial(list.size()); i++) {
//
//            for(int j = 0; j<list.size();j++){
//                temp += list.get(j);
//            }
//
//            if(temp.length()>0)
//            variants.add(temp);
//
//            temp="";
//        }
//
//        for(String s:variants){
//            System.out.println(s);
//        }
//    }
//
//    public static int factorial(int num){
//        int temp = 1;
//        for(int i = 1; i<num;i++){
//            temp*=i;
//        }
//        return temp;
//    }
}
