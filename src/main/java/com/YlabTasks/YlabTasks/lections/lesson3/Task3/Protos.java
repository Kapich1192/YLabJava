package com.YlabTasks.YlabTasks.lections.lesson3.Task3;

import java.util.Objects;

public class Protos {
    //field
    private String name;
    //constructors
    Protos(){}
    Protos(String name){
        this.name = name;
    }
    //getters
    public String getName(){return name;}
    //setters
    public void setName(String name){this.name= name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Protos protos = (Protos) o;
        return Objects.equals(name, protos.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //methods



}
