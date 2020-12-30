package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Son son = new Son();
        System.out.println("My mom is " + son.getAge() + " years old");
        son.age();
        son.clean("bathroom");
        son.doHomework();
        System.out.println("I like to " + son.activity());
        System.out.println();
        Daughter daughter = new Daughter();
        daughter.age();
        daughter.clean("kitchen");
        daughter.cook();
        daughter.doHomework();
        System.out.println("I've got " + daughter.mathProblems + " math problems to do for tomorrow.\nI've already done " + daughter.alreadyDone+ ", so now I have just " + daughter.exercises());

    }
}
