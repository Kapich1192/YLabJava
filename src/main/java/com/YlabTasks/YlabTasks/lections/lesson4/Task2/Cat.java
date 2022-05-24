package com.YlabTasks.YlabTasks.lections.lesson4.Task2;
/*
* Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
*  количество котов увеличивалось на 1. За количество котов отвечает переменная catsCount.
* class Cat
{
  private static int catsCount = 0;
  public static void addNewCat()
  {
     //написать тут ваш код
  }
}
* */
public class Cat {

    private static int catsCount = 0;

    public static void addNewCat(){
        catsCount++;
    }
}
