package org.example;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Compare two numbers!");
        try {

            System.out.print("Enter the first number: ");
            int first = Integer.parseInt(System.console().readLine());
            System.out.print("Enter the second number: ");
            int second = Integer.parseInt(System.console().readLine());

            if (first == second) {
                System.out.println("Numbers are the same!");
                return;
            }

            System.out.println("Biggest number: " + (first > second ? first : second));
        } catch (NumberFormatException e) {
            System.out.print("Error " + e.getMessage());
        }


    }
}
