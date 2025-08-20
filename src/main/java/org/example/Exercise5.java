package org.example;

import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Guess the magic number!");

        Random random = new Random();
        int number = random.nextInt(1, 101);
        int guessCount = 0;
        boolean gameOn = true;

        do {
            guessCount++;
            try {
                System.out.print("Your guess: ");
                int guess = Integer.parseInt(System.console().readLine());
                if (guess == number) {
                    System.out.println("Congratulations! You guessed correctly in " + guessCount + " guesses.");
                    gameOn = false;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }
            } catch (Exception e) {
                System.out.println("You have to write a number!");
            }

        } while (gameOn);

    }

}
