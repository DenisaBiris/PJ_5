package com.company;

public class Son extends Mother {
    Son() {
        System.out.println("I am the son");
        System.out.println("My family name is " + familyName + " and I am from " + houseaddress);}

    @Override
    public void doHomework() {
        System.out.println("I am doing my homework!");
    }

    @Override
    public void age() {
       Integer sonsAge = age - 20;
        System.out.println("I am " + sonsAge + " years old");

    }

    public String activity(){
        return "sing";
    }


}
