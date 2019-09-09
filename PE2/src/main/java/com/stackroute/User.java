package com.stackroute;

public class User {

    String firstName;
    String lastName;
    int age;
    double salary;
    public boolean isValidAge(){
        return age>=18 && age <=60;
    }
    public String getFullName(){
        return firstName+" "+lastName;
    }
}
