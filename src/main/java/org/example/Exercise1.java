package org.example;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.print("Your name: ");
        String name = System.console().readLine();
        String firstLetter = name.substring(0, 1).toUpperCase();
        String theRest = name.substring(1).toLowerCase();
        System.out.println("Hello " + firstLetter + theRest + "!");
    }
}
