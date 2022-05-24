package com.YlabTasks.YlabTasks.lections.lesson6.Task4;

public class Main {
    public static void main(String[] args) {
        for(int i = 0;i<500000;i++){
            new Cat("Stepan",7);
        }
        System.out.println("catCounter = " + Cat.getCatCounter());
    }
}
