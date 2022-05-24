package com.YlabTasks.YlabTasks.lections.lesson8.task10;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        long resultArrayList,resultLinkedList,start,end;
        ArrayList<Integer> list1 = new ArrayList<>(){{
            for(int i = 0; i<100000;i++)
                add((int)(Math.random()*100));
        }};
        LinkedList<Integer> list2 = new LinkedList<>(){{
            for(int i = 0; i<100000;i++)
                add((int)(Math.random()*100));
        }};
        start = new Date().getTime();
        for(int i = 0; i<list1.size();i++)
            list1.get(i);
        end = new Date().getTime();
        resultArrayList = end - start;

        start = new Date().getTime();
        for(int i =0;i<list2.size();i++)
            list2.get(i);
        end = new Date().getTime();
        resultLinkedList = end-start;
        System.out.println("ArrayList.get() 100000 time = " + resultArrayList + ";");
        System.out.println("LinkedList.get() 100000 time = " + resultLinkedList + ";");
    }
}
