package com.YlabTasks.YlabTasks.lections.lesson2.Task6;

public class Main {
    public static void main(String[] args) {
        Women kate = new Women("Kate");
        kate.addPet(new Dog("Martin"));
        kate.addPet(new Cat("Sofa"));
        kate.addPet(new Fish("Karp"));
        kate.printPets();
    }
}
