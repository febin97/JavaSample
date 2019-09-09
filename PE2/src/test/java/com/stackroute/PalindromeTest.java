package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class PalindromeTest
{
    private static Palindrome pe2;
    @BeforeClass
    public static void setup(){
        pe2 = new Palindrome();
    }
    @AfterClass
    public static void teardown(){
        pe2 = null;
    }
    @Test
    public void testCheckIfPalindrome(){
        assertEquals("Palindrome check is not Working",true,pe2.checkIfPalindrome("malayalam"));
        assertEquals("Palindrome check is not Working",false,pe2.checkIfPalindrome("Hello"));
        assertEquals("Palindrome check is not Working",true,pe2.checkIfPalindrome(""));
    }
    @Test
    public void testCheckIfPalindromeFailure(){
        assertNotNull("check palindrome not working",pe2.checkIfPalindrome("Helo"));
    }
}
