package com.YlabTasks.YlabTasks.lections.lesson7.task21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<>();
        Human grandmother1 = new Human("Raisa",Sex.WOMAN,88);
        family.add(grandmother1);
        Human grandmother2 = new Human("Carina",Sex.WOMAN,85);
        family.add(grandmother2);
        Human grandfather1 = new Human("Stepan",Sex.MAN,88);
        family.add(grandfather1);
        Human grandfather2 = new Human("Bogdan",Sex.MAN,99);
        family.add(grandfather2);
        Human father = new Human("Petr",Sex.MAN,45,grandfather1,grandmother1);
        family.add(father);
        Human mother = new Human("Masha",Sex.WOMAN,45,grandfather2,grandmother2);
        family.add(mother);
        Human son = new Human("Fedor",Sex.MAN,15,father,mother);
        family.add(son);
        Human daughter = new Human("Alisa",Sex.WOMAN,11,father,mother);
        family.add(daughter);
        for(Human s:family) {
            if(s.getMother()!=null && s.getFather() !=null)
            System.out.println("Имя: " + s.getName()+ ", пол: "+s.getSex()+", возраст: "+s.getAge()+", отец: "+s.getFather().getName()+
                    ", мать: "+s.getMother().getName());
            else
                System.out.println("Имя: " + s.getName()+ ", пол: "+s.getSex()+", возраст: "+s.getAge());

        }
    }
}
