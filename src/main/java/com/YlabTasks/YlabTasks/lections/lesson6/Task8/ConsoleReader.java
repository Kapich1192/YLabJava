package com.YlabTasks.YlabTasks.lections.lesson6.Task8;

import java.io.*;

public class ConsoleReader {

    /*читает с клавиатуры строку*/
    public static String readString()throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
    /*читает с клавиатуры число*/
    public static int readInt()throws IOException{
        String a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = reader.readLine();
        return Integer.parseInt(a);
    }
    /*читает с клавиатуры дробное число*/
    public static double readDouble()throws IOException{
        String a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = reader.readLine();
        return  Double.parseDouble(a);
    }
    /*читает с клавиатуры строку "true" или "false" и возвращает*/
    public static boolean readBoolean()throws IOException{
        String a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        a = reader.readLine();
        return Boolean.parseBoolean(a);
    }
}
