package ccc;

import java.util.Scanner;

/*
 * author: 
 * date: 12/02/2024
 * Chili Spiciness
 */

class Pepper {
    private String name;
    private int shuValue;

    public Pepper(String name, int shuValue) {
        this.name = name;
        this.shuValue = shuValue;
    }

    public String getName() {
        return name;
    }

    public int getShuValue() {
        return shuValue;
    }
}

class PepperCollection {
    private Pepper[] peppers;

    public PepperCollection(Pepper[] peppers) {
        this.peppers = peppers;
    }

    public Pepper getPepperByName(String name) {
        for (Pepper pepper : peppers) {
            if (pepper.getName().equals(name)) {
                return pepper;
            }
        }
        return null;
    }
}

public class ChiliSpiciness {

    public static int solve(int N, String[] pepperNames) {

        Pepper[] peppers = {
                new Pepper("Poblano", 1500),
                new Pepper("Mirasol", 6000),
                new Pepper("Serrano", 15500),
                new Pepper("Cayenne", 40000),
                new Pepper("Thai", 75000),
                new Pepper("Habanero", 125000)
        };

        PepperCollection pepperCollection = new PepperCollection(peppers);

        int totalSpiciness = 0;

        for (int i = 0; i < N; i++) {
            String pepperName = pepperNames[i].trim();
            Pepper pepper = pepperCollection.getPepperByName(pepperName);
            if (pepper != null) {
                totalSpiciness += pepper.getShuValue();
            }
        }

        return totalSpiciness;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] pepperNames = new String[N];
        for (int i = 0; i < N; i++) {
            pepperNames[i] = scanner.nextLine();
        }

        int totalSpiciness = solve(N, pepperNames);

        System.out.println("Total spiciness: " + totalSpiciness);

        scanner.close();
    }

}
