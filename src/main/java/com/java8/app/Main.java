package com.java8.app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java 8!");

        Main m = new Main();
        m.run();
    }

    private void run() {
        Person p = new Person();
        p.setFirstName("John");
        p.setLastName("Smith");

        Person mum = new Person();
        mum.setFirstName("Joan");
        mum.setLastName("Smith");

        p.setMother(mum);


        System.out.println(p.getFullName() + " ; Mum:  " + p.getMother().getFullName() );

        p.setAge(22);
        System.out.println(p.getFullName() + " ; " + p.getAge() );
    }
}