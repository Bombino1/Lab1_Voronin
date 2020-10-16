package ru.mirea.gibo03.lab1;
import java.lang.System;

public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book("Black", 170);
        Book b2 = new Book("Blue", 230);
        Book b3 = new Book("Yellow");

        b3.setPages(80);

        System.out.println(b1);

        b1.numberOfCharacters();
        b2.numberOfCharacters();
        b3.numberOfCharacters();
    }

}
