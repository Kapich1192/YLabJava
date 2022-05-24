package com.YlabTasks.YlabTasks.lections.lesson2.Task9;

public class MinimumOfThreeNumbers {
    public static int min(int a,int b, int c){
        if(a < b && a < c)
        return a;
        if(b < a && b < c)
        return b;
        return c;
    }

}
