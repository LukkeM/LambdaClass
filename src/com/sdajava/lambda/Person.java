package com.sdajava.lambda;

/**
 * Created by lukas on 01.03.2017.
 */
public class Person {

    public String name;
    public String lastname;
    public Integer age;

    public Person(String name, String lastname, Integer age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
