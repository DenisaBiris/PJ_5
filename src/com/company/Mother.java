package com.company;

public abstract class Mother {

    String familyName;
    String houseaddress;
    Integer age;



    Mother() {
        familyName = "Thomson";
        houseaddress = "Germany";
        age = 40;

    }
    public Integer getAge() {
        return age;
    }


    public void cook(){
        //do cook
        System.out.println("I am cooking something delicious for my mom!");

    }
    public void clean(String room){

        System.out.println("I am cleaning the "+ room +" because mom is busy!");
    }

    public abstract void doHomework();

    public abstract void age();
}
