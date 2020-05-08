package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsAndLettersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));
    }

    @Test
    public void bracketsInCorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void wordsAndBracketsInCorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code]"));
    }

    @Test
    public void openingBracketsOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void mixedUpBracketsReturnsFalse() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void mixedUpBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void mixedPairsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }

    @Test
    public void mixedPairsWithWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]boat54]["));
    }

    @Test
    public void spaceWithBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[ ]"));
    }


//    @Test
//    public void mixedBracket12() {
//        assertTrue(BalancedBrackets.hasBalancedBrackets("[][[]]"));
//    }

}
