package com.company;

public class Daughter extends Mother {
    Integer mathProblems = 58;
    Integer alreadyDone = 27;
    Daughter() {
        System.out.println("I am the daughter");
        System.out.println("My family name is " + familyName + " and I am from " + houseaddress);
    }

    @Override
    public void doHomework() {
        System.out.println("I am doing my homework later!");
    }

    @Override
    public void age() {
        Integer daughtersAge = age - 22;
        System.out.println("I am " + daughtersAge + " years old");
    }

    public Integer exercises(){
        return mathProblems-alreadyDone;
    }
}