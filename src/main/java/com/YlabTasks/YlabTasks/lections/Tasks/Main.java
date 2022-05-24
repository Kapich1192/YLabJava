package com.YlabTasks.YlabTasks.lections.Tasks;

import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{

        StreamTokenizer in = new StreamTokenizer(
                new FileReader("input.txt"));

        PrintStream out = new PrintStream("output.txt");

        int a,b,c,d;
        in.nextToken();
        a = (int)in.nval;
        in.nextToken();
        b = (int)in.nval;
        in.nextToken();
        c = (int)in.nval;
        in.nextToken();
        d = (int)in.nval;
        out.println(tarif(a,b,c,d));
    }

    public static int tarif(int a,int b,int c,int d){
        int f;
        f = (d-b)*c;
        if(f>0)return f + a;else return a;

    }
}
