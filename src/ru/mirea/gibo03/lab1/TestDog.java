package ru.mirea.gibo03.lab1;
import java.lang.System;

public class TestDog {
    public static void main(String[] args) {

        Dog d1 = new Dog("Biba", 4);
        Dog d2 = new Dog("Boba", 5);
        Dog d3 = new Dog("Boris");

        d3.setAge(4);

        System.out.println(d1);

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
