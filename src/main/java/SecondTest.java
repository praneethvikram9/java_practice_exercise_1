package main.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondTest {

    Second temp;

    @Before
    public void setUp() throws Exception {
        temp=new Second();
    }

    @After
    public void tearDown() throws Exception {
        temp=null;
    }


    @Test

    public void secondtestPositive(){

        String expected = "Tom";
        //Act
        String result = temp.main(24);
        assertEquals(expected,result);
        //assertTrue(result);

    }

}