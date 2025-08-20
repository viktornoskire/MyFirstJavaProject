package org.example;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("BMI-Kalkylator");
        try {

            System.out.print("Your weight in kilograms: ");
            double weight = Double.parseDouble(System.console().readLine());
            System.out.print("Your height in meter: ");
            double length = Double.parseDouble(System.console().readLine());

            double bmi = weight / (length * length);
            if (bmi < 18.5) {
                System.out.println("Underweight");
            } else if (bmi > 18.5 && bmi < 25) {
                System.out.println("Normal");
            } else {
                System.out.println("Obese");
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
