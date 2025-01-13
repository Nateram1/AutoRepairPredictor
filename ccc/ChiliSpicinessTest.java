package ccc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChiliSpicinessTest {
    @Test

    public void testSolve_sampleTest1() {
        int N = 4;
        String[] pepperNames = { "Poblano", "Cayenne", "Thai", "Poblano" };

        int actual = ChiliSpiciness.solve(N, pepperNames);

        int expected = 118000;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSolve2() {
        int N = 6;
        String[] pepperNames = { "Thai", "Thai", "Poblano", "Habanero", "Serrano", "Mirasol" };

        int actual = ChiliSpiciness.solve(N, pepperNames);

        int expected = 298000;

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSolve3() {
        int N = 3;
        String[] pepperNames = { "Cayenne", "Serrano", "Mirasol" };

        int actual = ChiliSpiciness.solve(N, pepperNames);

        int expected = 61500;

        Assertions.assertEquals(expected, actual);

    }
}
