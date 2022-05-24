package com.YlabTasks.YlabTasks.lections.lesson8.task9;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Long> workTimeArrayList = new HashMap<>();
        HashMap<String,Long> workTimeLinkedList = new HashMap<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        long start,end;
        int count = 100000;
        //add
        //ArrayList
        start = new Date().getTime();
        for(int i = 0; i<count;i++)
            list1.add((int)(Math.random()*100));
        end = new Date().getTime();
        workTimeArrayList.put("arrayList.add",end-start);
        //LinkedList
        start= new Date().getTime();
        for(int i = 0;i<count;i++)
            list2.add((int)(Math.random()*100));
        end = new Date().getTime();
        workTimeLinkedList.put("linkedList.add",end-start);
        //set
        //get
        //remove
        //print result
        System.out.println("al.add = " + workTimeArrayList.get("arrayList.add"));
        System.out.println("ll.add = " + workTimeLinkedList.get("linkedList.add"));
    }
}
