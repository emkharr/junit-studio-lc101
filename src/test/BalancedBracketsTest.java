package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {assertEquals(true, true);}

    @Test
    public void noBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets(""));}

    @Test
    public void oneSetBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}

    @Test
    public void twoNestedBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));}

    @Test
    public void threeNestedBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));}

    @Test
    public void wordInBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}

    @Test
    public void wordInDoubleBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch[Code]]"));}

    @Test
    public void partialWordInBracketsReturnsTrue() {assertTrue(BalancedBrackets.hasBalancedBrackets("[Launch]Code"));}

    @Test
    public void backwardsBracketsReturnsFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}

    @Test
    public void singleLeftBracketReturnsFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("["));}

    @Test
    public void singleRightBracketReturnsFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("]"));}

    @Test
    public void wordInMismatchedBracketsReturnsFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code]"));}

    @Test
    public void crazyBracketsReturnsFalse() {assertFalse(BalancedBrackets.hasBalancedBrackets("[[[][[][[[]]]"));}


}
