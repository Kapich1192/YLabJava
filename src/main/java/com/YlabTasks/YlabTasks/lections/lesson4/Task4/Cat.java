package com.YlabTasks.YlabTasks.lections.lesson4.Task4;
/*Реализовать метод setName,
 чтобы с его помощью можно было устанавливать значение переменной
  private String fullName равное значению локальной переменной String fullName.

class Cat
{
  private String fullName;
  public void setName(String firstName, String lastName)
  {
   String fullName = firstName + lastName;
   //написать тут ваш код
  }
}
  */
public class Cat {

    private String fullName;

    public void setFullName(String firstName, String lastName) {
        String fullName = firstName + lastName;
    }
}
