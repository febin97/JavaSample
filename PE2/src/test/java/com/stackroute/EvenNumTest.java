package com.stackroute;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest {
    private static EvenNum pe2;
    @BeforeClass
    public static void setup(){
        pe2 = new EvenNum();
    }
    @AfterClass
    public static void teardown(){
        pe2 = null;
    }
    @Test
    public void testIsEven(){
        assertEquals("isEven() not working ",true,pe2.isEven(22));
        assertEquals("isEven() not working ",false,pe2.isEven(11));
        assertEquals("isEven() not working ",false,pe2.isEven(-22));
        assertEquals("isEven() not working ",true,pe2.isEven(0));
    }
}
