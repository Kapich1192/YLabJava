package com.YlabTasks.YlabTasks.lections.Tasks.tasck2;

import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws IOException{
        int a,b;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();

        Scanner scan = new Scanner(line);

        a = scan.nextInt();
        b = scan.nextInt();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("" + sum(a,b));
        writer.close();

    }

    public static int sum(int a,int b){
        return a + b;
    }

}
