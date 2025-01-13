package ccc;

/*
 * author: 
 * date:
 * SilentAuctionTest
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SilentAuctionTest {
    @Test
    public void testSolve() {
        int n = 3;
        Bidder[] bidders = {
                new Bidder("Ahmed", 300),
                new Bidder("Suzanne", 500),
                new Bidder("Ivona", 450),
        };

        String actual = SilentAuction.solve(n, bidders);

        String expected = "Suzanne";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSolve_customInput2() {
        int n = 2;
        Bidder[] bidders = {
                new Bidder("Rick", 20),
                new Bidder("Aton", 20),
        };

        String actual = SilentAuction.solve(n, bidders);

        String expected = "Rick";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSolve_customInput() {
        int n = 2;
        Bidder[] bidders = {
                new Bidder("Nick", 40),
                new Bidder("Anton", 40),
        };

        String actual = SilentAuction.solve(n, bidders);

        String expected = "Nick";
        Assertions.assertEquals(expected, actual);

    }
}
