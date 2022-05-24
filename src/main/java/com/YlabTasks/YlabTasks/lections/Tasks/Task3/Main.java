package com.YlabTasks.YlabTasks.lections.Tasks.Task3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();
        Scanner sc = new Scanner(line);
        int a,b,c,d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(tarif(a,b,c,d)));
        writer.close();
    }

    public static int tarif(int a,int b,int c,int d){
        int f;
        f = (d-b)*c;
        if(f>0)return f + a;else return a;

    }
}
