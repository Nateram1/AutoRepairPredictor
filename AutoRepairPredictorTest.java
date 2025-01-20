package CPT;

/* author: Nateram
 * date: 01/19/2025
 * Auto Repair Predictor
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * CarRepairCostCalculator.java
 * This program calculates the cost of car repairs based on user input.
 */
public class AutoRepairPredictorTest {
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
        new City("Toronto", new String[] {"Repair Shop A", "Repair Shop B", "Repair Shop C", "Repair Shop D", "Repair Shop E"}),
        new City("Ottawa", new String[] {"Repair Shop F", "Repair Shop G", "Repair Shop H", "Repair Shop I", "Repair Shop J"}),
        new City("Mississauga", new String[] {"Repair Shop K", "Repair Shop L", "Repair Shop M", "Repair Shop N", "Repair Shop O"}),
        new City("Brampton", new String[] {"Repair Shop P", "Repair Shop Q", "Repair Shop R", "Repair Shop S", "Repair Shop T"}),
        new City("Hamilton", new String[] {"Repair Shop U", "Repair Shop V", "Repair Shop W", "Repair Shop X", "Repair Shop Y"}),
        new City("London", new String[] {"Repair Shop Z", "Repair Shop AA", "Repair Shop AB", "Repair Shop AC", "Repair Shop AD"}),
        new City("Markham", new String[] {"Repair Shop AE", "Repair Shop AF", "Repair Shop AG", "Repair Shop AH", "Repair Shop AI"}),
        new City("Vaughan", new String[] {"Repair Shop AJ", "Repair Shop AK", "Repair Shop AL", "Repair Shop AM", "Repair Shop AN"}),
        new City("Kitchener", new String[] {"Repair Shop AO", "Repair Shop AP", "Repair Shop AQ", "Repair Shop AR", "Repair Shop AS"}),
        new City("Windsor", new String[] {"Repair Shop AT", "Repair Shop AU", "Repair Shop AV", "Repair Shop AW", "Repair Shop AX"})
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

        System.out.println("The total cost for the selected car issues is $" + totalCost);

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

        System.out.println("\nHere are 5 nearby auto repair shops in " + cities[cityChoice - 1].getName() + ":");
        for (String shop : cities[cityChoice - 1].getRepairShops()) {
            System.out.println(shop);
            repairQueue.add(shop);
        }

        System.out.println("\nRepair shops in the queue (FIFO order):");
        while (!repairQueue.isEmpty()) {
            System.out.println(repairQueue.poll());
        }

        scanner.close();
    }
}
