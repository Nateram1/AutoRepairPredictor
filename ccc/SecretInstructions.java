package ccc;

import java.util.Scanner;

public class SecretInstructions {
    // Method to solve the instructions
    public static String solve(String instruction) {
        if (instruction.equals("99999")) {
            return ""; // Handle the termination case
        }

        StringBuilder result = new StringBuilder();  // Store the result
        String prevDirection = null;  // Previous direction (initially null)

        // Extract the first two digits and the remaining digits
        int firstDigit = Character.getNumericValue(instruction.charAt(0));
        int secondDigit = Character.getNumericValue(instruction.charAt(1));
        int steps = Integer.parseInt(instruction.substring(2));  // Convert to integer for steps

        String direction = "";

        // Handle the case where both digits are 0 (0 + 0 = 0, which is even)
        if (firstDigit + secondDigit == 0) {
            // If the sum is 0, same direction as the previous instruction
            if (prevDirection != null) {
                direction = prevDirection;
            } else {
                // If no previous direction, initialize the direction as 'right'
                direction = "right";
            }
        } else if ((firstDigit + secondDigit) % 2 == 0) {
            // Even sum (excluding 00 case, already handled above): right
            direction = "right";
        } else {
            // Odd sum: left
            direction = "left";
        }

        // Append the decoded instruction to the result
        result.append(direction).append(" ").append(steps).append("\n");

        // Update the previous direction for the next instruction
        prevDirection = direction;

        // Return the result as a string
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner for user input

        // Loop to continuously take user input
        while (true) {
            String instruction = input.nextLine().trim();

            // Exit condition when user enters '99999'
            if (instruction.equals("99999")) {
                break;
            }

            // Call the solve method for each instruction
            String result = solve(instruction);

            // Print the result
            System.out.println(result);
        }

        // Close the scanner after use
        input.close();
    }
}
