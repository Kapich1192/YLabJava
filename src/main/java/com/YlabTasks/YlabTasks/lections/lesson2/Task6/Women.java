package com.YlabTasks.YlabTasks.lections.lesson2.Task6;

import java.util.ArrayList;

public class Women {
    String name;
    ArrayList<Pet> pets;
    Women(String name){
        this.name = name;
        pets = new ArrayList<>();
    }
    public void addPet(Pet pet){
        pets.add(pet);
    }
    public void printPets(){
        for(Pet s:pets){
            System.out.println(s.name);
        }
    }
}
