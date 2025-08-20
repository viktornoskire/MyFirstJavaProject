package org.example;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Temperature in Celsius: ");
        String input = System.console().readLine();
        try {
            double celsius = Double.parseDouble(input);
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + " degrees");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + input);
        }
    }
}
