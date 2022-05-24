package com.YlabTasks.YlabTasks.lections.lesson5.Task19;


import java.util.Date;

public class DisplayTodayDate {
    public static void main(String[] args) {
        Date date = new Date();
        int year = date.getYear()-100 + 2000;
        System.out.println(date.getDate() + " " +date.getMonth() + " " + year);
    }
}
