package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

Palindrome  temp;


    @Before
    public void setUp() throws Exception {
        temp = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void palindrome_testPositive(){

        String expected = "it  is a palindrome and sum of even numbers is greater than 25";
        String result=temp.check_palindrome(2468642);
        assertEquals(expected,result);
    }
}