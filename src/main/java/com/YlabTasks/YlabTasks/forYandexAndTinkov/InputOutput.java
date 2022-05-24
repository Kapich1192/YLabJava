package com.YlabTasks.YlabTasks.forYandexAndTinkov;

import java.io.*;

public class InputOutput {
    public static String input()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        reader.close();
        return line;
    }
    public static void outputInt(int answer)throws IOException{
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write(String.valueOf(answer));
        writer.close();
    }
}
