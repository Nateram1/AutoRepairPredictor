package numberguessinggame;

import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * author: Mr. Habib
 * date: 09/06/2024
 * Binary Search + a game
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Print a welcome screen
        System.out.println();
        System.out.println("Welcome to my number gg!");
        System.out.print("Written by: ");
        String name = "Mr. Habib";
        System.out.printf("%s!\n", name);

        // Generate a random number
        int minRange = 1;
        int maxRange = 100;

        int randomNumber = genRandomNumberBetween(minRange, maxRange);
        System.out.println(randomNumber);

        int numGuessesAllowed = 7;
        int numGuesses = 0;
        int userGuess = 0;
        do {
            // Ask the user to enter a number
            System.out.print("Enter a number: ");
            try {
                userGuess = input.nextInt();
            } catch (InputMismatchException e) {
                userGuess = -1;
            }


            if (userGuess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            }
            // numGuesses = numGuesses + 1;
            // numGuesses += 1;
            numGuesses++;
        }
        while (userGuess != randomNumber && numGuesses < numGuessesAllowed);

        if (userGuess == randomNumber) {
            System.out.println("Congratz!!");
        } else {
            System.out.println("Big Ls");
        }
        input.close();
    }

    public static int genRandomNumberBetween(int start, int end) {
        return (int)(start + Math.random() * (end - start + 1));
    }
}

