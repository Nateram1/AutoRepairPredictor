# Auto Repair Predictor
Made By: Nateram B
NOTE: AI was used to assist with the queues/linked list, and the array list, as well as some of the test cases, other than that the code was entirely made by me.
This program will predict the total repair cost for the user’s car depending on what issues they’re having, and then it will suggest a few auto repair shops nearby depending on what city the user is in.
Simply run the program and open the terminal and follow the instructions.
Limits:
- Can only display 10 common car issues, so your particular issue might not be there
- Can only display 3 auto repair shops at a time in a city so it might not be accurate to you
- Not very visually appealing


```Auto Repair Predictor Main Method
package CPT;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Scanner;

/* author: Nateram
 * date: 01/19/2025
 * Auto Repair Predictor
 */

/**
 * CarRepairCostCalculator.java
 * This program calculates the cost of car repairs based on user input.
 * 
 * NOTE: AI was used to assist with the queues/linked list, and the array list, as well as some of the test cases, other than that
 * the entire code was made by me
 */
public class AutoRepairPredictor {
    private static final CarIssue[] carIssues = {
        new CarIssue("Flat tire", 50),
        new CarIssue("Brake replacement", 200),
        new CarIssue("Oil change", 30),
        new CarIssue("Battery replacement", 100),
        new CarIssue("Alternator repair", 250),
        new CarIssue("Transmission repair", 1500),
        new CarIssue("Engine repair", 3000),
        new CarIssue("AC repair", 200),
        new CarIssue("Wheel alignment", 100),
        new CarIssue("Exhaust repair", 150)
    };

    private static final City[] cities = {
        new City("Toronto", new String[] {"EuroMechanic", "Central Import", "SSR Auto Service"}),
        new City("Ottawa", new String[] {"Sammy's Repair Center", "AAA Kavtech Inc", "Eagle Auto"}),
        new City("Mississauga", new String[] {"Auto Repairs Signature Tire", "KC Auto Repair and Services", "My Garage Inc"}),
        new City("London", new String[] {"Ron Kraft Auto Care", "Vaughan Auto Service", "Automotive Solutions and Tires"}),
        new City("Markham", new String[] {"iGarage Auto Service", "Danny's Auto", "Markham Auto Repair"}),
        new City("Vaughan", new String[] {"Mobile Mechanic by Marco MMBM", "AA+ Auto Care Inc", "West Vaughan Auto"}),
        new City("Kitchener", new String[] {"K-W Auto Inc", "Hansma Auto Service Inc", "Gord Kaster Auto"}),
        new City("Windsor", new String[] {"Royal Windsor Auto Service", "Midas Auto", "West End Tire and Auto Center Inc"})
    };

    /**
     * Calculate the total cost of selected car issues.
     *
     * @param selectedIssues Array of selected car issue indices
     * @return Total cost of selected car issues
     */
    public double calculateTotalCost(int[] selectedIssues) {
        double totalCost = 0;
        for (int index : selectedIssues) {
            totalCost += carIssues[index - 1].getCost();
        }
        return totalCost;
    }

    /**
     * Get the list of repair shops for a selected city.
     *
     * @param cityIndex Index of the selected city
     * @return Array of repair shops in the selected city
     */
    public String[] getRepairShops(int cityIndex) {
        return cities[cityIndex - 1].getRepairShops();
    }

    /**
     * Validate the user's choice for car issue.
     *
     * @param choice User's choice for car issue
     * @return True if the choice is valid, false otherwise
     */
    public boolean validateCarIssueChoice(int choice) {
        return choice >= 1 && choice <= carIssues.length;
    }

    /**
     * Validate the user's choice for city.
     *
     * @param choice User's choice for city
     * @return True if the choice is valid, false otherwise
     */
    public boolean validateCityChoice(int choice) {
        return choice >= 1 && choice <= cities.length;
    }

    // Existing main method...
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> repairQueue = new LinkedList<>();
        ArrayList<CarIssue> selectedIssues = new ArrayList<>();
        double totalCost = 0;

        for (int j = 0; j < 3; j++) {
            System.out.println("Enter a number (1-10) corresponding to a car issue:");
            for (int i = 0; i < carIssues.length; i++) {
                System.out.println((i + 1) + ". " + carIssues[i].getDescription());
            }
            int carIssueChoice = scanner.nextInt();

            if (carIssueChoice < 1 || carIssueChoice > carIssues.length) {
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
            }

            CarIssue selectedIssue = carIssues[carIssueChoice - 1];
            totalCost += selectedIssue.getCost();
            selectedIssues.add(selectedIssue);
            System.out.println("Selected: " + selectedIssue.getDescription());
        }

       

        System.out.println("\nEnter a number (1-10) corresponding to a city in Ontario:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i].getName());
        }
        int cityChoice = scanner.nextInt();

        if (cityChoice < 1 || cityChoice > cities.length) {
            System.out.println("Invalid choice. Exiting program.");
            scanner.close();
            return;
        }

        System.out.println("\nHere are nearby auto repair shops in " + cities[cityChoice - 1].getName() + ":");
        for (String shop : cities[cityChoice - 1].getRepairShops()) {
            System.out.println(shop);
            repairQueue.add(shop);
        }
        System.out.println("The total cost for the selected car issues is $" + totalCost);
        scanner.close();
    }

}

        
```
