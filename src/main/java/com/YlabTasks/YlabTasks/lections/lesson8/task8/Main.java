package com.YlabTasks.YlabTasks.lections.lesson8.task8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(){{
            for(int i =0; i<10000;i++)
            add((int)(Math.random()*100));
        }};

        LinkedList<Integer> linkedList = new LinkedList<>(){{
            for(int i=0;i<10000;i++)
                add((int)(Math.random()*100));
        }};

        for(int i = 0; i<10000; i++)
            arrayList.get(i);

        for(int i =0; i<10000;i++)
            linkedList.get(i);

        for(int i = 0; i<10000;i++)
            arrayList.set(i,(int)(Math.random()*100));

        for(int i = 0; i<10000; i++)
            linkedList.set(i,(int)(Math.random()*100));

        for(int i = arrayList.size()-1;i>=0;i--)
            arrayList.remove(i);

        for(int i = linkedList.size()-1;i>=0;i--)
            linkedList.remove(i);
    }
}
