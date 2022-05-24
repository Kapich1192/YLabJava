package com.YlabTasks.YlabTasks.lections.lesson4.Task19;

public class DrawTriangle {
    public static void main(String[] args) {
        printTriangle(10,10,"8");
    }
    public static void printTriangle(int cathet1, int cathet2,String marker){
        for(int i = 1; i<=cathet1;i++){
            for(int j = 1;j<=i && j <=cathet2;j++){
                System.out.print(" " + marker);
            }
            System.out.println("");
        }
    }
}
