package com.YlabTasks.YlabTasks.lections.lesson4.Task20;

public class DrawLines {
    public static void main(String[] args) {
        drawGLine(10,"8");
        drawVLine(10,"8");
    }
    public static void drawVLine(int length,String marker){
        for(int i = 0; i<length;i++){
            System.out.println(marker);
        }
    }
    public static void drawGLine(int length,String marker){
        for(int i = 0; i<length;i++ ){
            System.out.print(marker);
        }
    }
}
