package ccc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecretInstructionsTest {
   
    //ccc sample inputs
    @Test
    public void testSolve_sampleTest1() {
        String instruction = "57234";
        String expected = "right 234";
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }

    @Test
    public void testSolve_sampleTest2() {
        String instruction = "00907";
        String expected = "right 907";
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }

    @Test
    public void testSolve_sampleTest3() {
        String instruction = "34100";
        String expected = "left 100";
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }


    
    @Test
    public void testSolve_sampleTest4() {
        String instruction = "99999";
        String expected = "";        
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }


    //Custom test cases
    @Test
    public void testSolve_sampleTest5() {
        String instruction = "67123";
        String expected = "left 123";        
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }

    @Test
    public void testSolve_sampleTest6() {
        String instruction = "84901";
        String expected = "right 901";        
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }

    @Test
    public void testSolve_sampleTest7() {
        String instruction = "16430";
        String expected = "left 430";        
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }

    @Test
    public void testSolve_sampleTest8() {
        String instruction = "99999";
        String expected = "";        
        Assertions.assertEquals(expected, SecretInstructions.solve(instruction));
    }
}
