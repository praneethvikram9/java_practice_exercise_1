package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Check_asciiTest {

    Check_ascii temp;

    @Before
    public void setUp() throws Exception {
        temp= new Check_ascii();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }

    @Test

    public void AsciitestPositive(){
        String expected = "Vowel";
        //Act
        String result=temp.check_character("a");
        assertEquals(expected,result);
    }



}