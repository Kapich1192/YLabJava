package com.YlabTasks.YlabTasks.lections.lesson4.Task18;
import java.util.Scanner;
public class DrawRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n; String marker = "8";
        System.out.println("Input number n: ");
        n = input.nextInt();
        System.out.println("Input number m: ");
        m = input.nextInt();
        printRectangle(m,n,marker);
    }

    public static void printRectangle(int m, int n, String marker){
        for(int i = 1; i<=m;i++){
            for(int j = 1; j<= n; j++){
                System.out.print(" " + marker);
            }
            System.out.println("");
        }
    }
}
