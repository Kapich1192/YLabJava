package com.YlabTasks.YlabTasks.lections.lesson5.Task1_5;

public abstract class Pets {
   private String name;

    void sayHello() {
        System.out.println(this.getName() + " Hello");
    }

    public String getName() {
        return name;
    }
}
