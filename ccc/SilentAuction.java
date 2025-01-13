package ccc;

import java.util.Scanner;

/*
 * author: 
 * date:
 * SilentAuction
 */

public class SilentAuction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        input.nextLine();

        Bidder[] bidders = new Bidder[n];

        for (int i = 0; i < n; i++) {
            String name = input.nextLine();

            int bidAmount = input.nextInt();

            input.nextLine();

            bidders[i] = new Bidder(name, bidAmount);

        }

        String winningName = solve(n, bidders);

        System.out.println(winningName);

        input.close();
    }

    // Method to determine the winner
    public static String solve(int n, Bidder[] bidders) {
        String winner = bidders[0].getName();
        int highestBid = bidders[0].getBidAmount();

        // Check each bidder and update the winner if necessary
        for (int i = 1; i < n; i++) {
            if (bidders[i].getBidAmount() > highestBid) {
                winner = bidders[i].getName();
                highestBid = bidders[i].getBidAmount();
            }
        }

        return winner;
    }
}

class Bidder {
    private String name;
    private int bidAmount;

    public Bidder(String name, int bidAmount) {
        this.name = name;
        this.bidAmount = bidAmount;
    }

    public String getName() {
        return name;
    }

    public int getBidAmount() {
        return bidAmount;
    }

}
