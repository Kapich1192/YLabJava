package com.YlabTasks.YlabTasks.lections.lesson2.Task10;

public class MinimumOfFourNumbers {
    public static int min(int a, int b){
        if(a>b)return b; else return a;
    }

    public static int min(int a, int b, int c, int d){
        int q = min(a,b);
        int w = min(c,d);
        if(q>w)return w; else return q;
    }
}
