package ccc;

import java.util.Scanner;

class CarIssue {
    private String description;
    private double cost;

    public CarIssue(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}

class City {
    private String name;
    private String[] repairShops;

    public City(String name, String[] repairShops) {
        this.name = name;
        this.repairShops = repairShops;
    }

    public String getName() {
        return name;
    }

    public String[] getRepairShops() {
        return repairShops;
    }
}

public class test {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: User enters car issue
        System.out.println("Enter a number (1-10) corresponding to a car issue:");
        for (int i = 0; i < carIssues.length; i++) {
            System.out.println((i + 1) + ". " + carIssues[i].getDescription());
        }
        int carIssueChoice = scanner.nextInt();

        if (carIssueChoice < 1 || carIssueChoice > 10) {
            System.out.println("Invalid choice. Exiting program.");
            return;
            
        }

        double totalCost = carIssues[carIssueChoice - 1].getCost();
        System.out.println("The total cost for " + carIssues[carIssueChoice - 1].getDescription() + " is $" + totalCost);

        // Step 2: User enters city
        System.out.println("\nEnter a number (1-10) corresponding to a city in Ontario:");
        for (int i = 0; i < cities.length; i++) {
            System.out.println((i + 1) + ". " + cities[i].getName());
        }
        int cityChoice = scanner.nextInt();

        if (cityChoice < 1 || cityChoice > 10) {
            System.out.println("Invalid choice. Exiting program.");
            return;
            
        }

        // Step 3: Display nearby auto repair shops
        System.out.println("\nHere are 5 nearby auto repair shops in " + cities[cityChoice - 1].getName() + ":");
        for (String shop : cities[cityChoice - 1].getRepairShops()) {
            System.out.println(shop);
        }

        scanner.close();
    }
}

