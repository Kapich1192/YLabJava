package com.YlabTasks.YlabTasks.lections.lesson3.Task3;

import java.util.ArrayList;

public class StarCraft {
    public static void main(String[] args) {
        Zerg[] zergs = new Zerg[10];
        zergs[0] = new Zerg("Volf");
        zergs[1] = new Zerg("Ram");
        zergs[2] = new Zerg("Roma");
        zergs[3] = new Zerg("Ara");
        zergs[4] = new Zerg("Fat");
        zergs[5] = new Zerg("Tet");
        zergs[6] = new Zerg("Sig");
        zergs[7] = new Zerg("Leva");
        zergs[8] = new Zerg("Hrom");
        zergs[9] = new Zerg("Soul");

        ArrayList<Protos> protosArrayList = new ArrayList<>(){{
            add(new Protos("Grive"));
            add(new Protos("Ciborg"));
            add(new Protos("Sun"));
            add(new Protos("Mars"));
            add(new Protos("Mercuriy"));
        }};

        ArrayList<Terran> terrans = new ArrayList<>(){{
            add(new Terran("Ven"));
            add(new Terran("Cruve"));
            add(new Terran("Silv"));
            add(new Terran("Kirill"));
            add(new Terran("Symb"));
            add(new Terran("Hyper"));
            add(new Terran("Gamlet"));
            add(new Terran("Tim"));
            add(new Terran("Shon"));
            add(new Terran("Gulbaric"));
            add(new Terran("Jimmy"));
            add(new Terran("Libher"));
        }};
    }
}
