package com.YlabTasks.YlabTasks.forYandexAndTinkov.task2TincovContest;

import java.io.*;
import java.util.HashMap;


public class Main{
    public static void main(String[] args)throws Exception{
        String s1 = input();
        String s2 = input();

        char[] keys = s1.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
            for(Character s:keys){
                map.put(s,0);
            }


        int temp;

        for(int i =0; i<s2.length();i++){
            if(map.containsKey(s2.charAt(i))){
            temp = map.get(s2.charAt(i));
            temp++;
            map.put(s2.charAt(i),temp);}
        }
        int answer = 0;
        for(Character key:map.keySet()){
            answer+=map.get(key);
        }

        outputInt(answer);
    }

    public static String input()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
    public static void outputInt(int answer)throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(answer));
        writer.close();
    }

}