package com.YlabTasks.YlabTasks.lections.lesson6.Task18;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat gfVasya = new Cat("grandfather Vasia");
        Cat gmMurca = new Cat("grandmother Murca");
        Cat fKotofey = new Cat("father Kotofey", gfVasya.getName(), gmMurca.getName());
        Cat mVaselisa = new Cat("mother Vaselisa", gfVasya.getName(), gmMurca.getName());
        Cat sMurchik = new Cat("son Murchic", fKotofey.getName(), mVaselisa.getName());
        Cat dPushinka = new Cat("daughter Pushinka", fKotofey.getName(), mVaselisa.getName());
        ArrayList<Cat> cats = new ArrayList<>(){{
            add(gfVasya);add(gmMurca);add(fKotofey);add(mVaselisa);add(sMurchik);add(dPushinka);
        }};
        for(Cat cat:cats){
            System.out.println("Cat name is " + cat.getName() + "," + cat.getMother() + ", " + cat.getFather());
        }

    }
}
