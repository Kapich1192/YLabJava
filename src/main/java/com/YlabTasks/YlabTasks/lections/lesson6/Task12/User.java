package com.YlabTasks.YlabTasks.lections.lesson6.Task12;

import java.util.ArrayList;

public class User {
    //static fields
    private static ArrayList<User> users= new ArrayList<>();
    //fields
    private String name;
    private String lastname;
    private String login;
    private String password;
    private String email;
    private String telephone;
    private String bio;
    private String accountStatus;
    private boolean verification = false;
    //constructors
    public User(){
        users.add(this);
    }
    public User(String login,String password){
        this.login = login;
        this.password = password;
        users.add(this);
    }
    //getters
    //setters
    //system
        //initialize
        //equals
        //hashcode
        //toString
        //finalize
    //methods
    //static methods

}
