package com.YlabTasks.YlabTasks.lections.lesson7.task20;

public class Boom {
    public static void main(String[] args) throws InterruptedException {
        for(int i=30;i>=0;i--){
            Thread.sleep(100);
            System.out.println(i);
            if(i==0) System.out.println("Boom!");
        }
    }
}
