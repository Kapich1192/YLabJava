package com.YlabTasks.YlabTasks.lections.lesson6.Task10;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Cat();
        }
        System.out.println("catCounter = " + Cat.getCatCounter());
    }
}
