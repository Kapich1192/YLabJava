package com.YlabTasks.YlabTasks.lections.lesson4.Task3;
/*Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать
значение переменной catsCount равное переданному параметру.
class Cat
{
  private static int catsCount = 0;
  public static setCatsCount(int catsCount)
  {
     //написать тут ваш код
  }
}
*/
public class Cat {
  private static int catsCount = 0;

  public static void setCatsCount(int catsCount){
      Cat.catsCount = catsCount;
  }
}
