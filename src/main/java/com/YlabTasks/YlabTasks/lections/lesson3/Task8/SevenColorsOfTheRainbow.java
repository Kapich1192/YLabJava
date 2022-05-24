package com.YlabTasks.YlabTasks.lections.lesson3.Task8;

import java.util.HashSet;

public class SevenColorsOfTheRainbow {
    public static void main(String[] args) throws RuntimeException{
        HashSet<RainbowColor> set = new HashSet<>(){{
        add(new RainbowColor(RainbowColor.Color.Red));
        add(new RainbowColor(RainbowColor.Color.Orange));
        add(new RainbowColor(RainbowColor.Color.Yellow));
        add(new RainbowColor(RainbowColor.Color.Green));
        add(new RainbowColor(RainbowColor.Color.SkyBlue));
        add(new RainbowColor(RainbowColor.Color.Blue));
        add(new RainbowColor(RainbowColor.Color.Fillet));
        }};
        for(RainbowColor s:set){
            System.out.println(s.toString());
        }

    }
}
