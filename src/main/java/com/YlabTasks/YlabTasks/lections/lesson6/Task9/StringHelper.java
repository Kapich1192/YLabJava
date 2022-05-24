package com.YlabTasks.YlabTasks.lections.lesson6.Task9;

public class StringHelper {
    public static String multiply(String s,int count){
        String temp = s;
        for(int i = 0;i<count-1;i++){
            s+=temp;
        }
        return s;
    }
    public static String multiply(String s){
        String temp = s;
        for (int i = 0; i < 4; i++) {
            s+=temp;
        }
        return s;
    }
}
