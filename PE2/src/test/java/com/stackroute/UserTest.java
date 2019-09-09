package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    private static User pe2;
    @Before
    public void setUp() throws Exception {
        pe2 = new User();
    }

    @After
    public void tearDown() throws Exception {
        pe2 = null;
    }

    @Test
    public void testUser() {
        pe2.firstName = "febin";
        pe2.lastName = "thomas";
        pe2.age = 22;
        pe2.salary = 10000;
        assertEquals("Age function inCorrect",true,pe2.isValidAge());
        assertEquals("Full name function is incorrect","febin thomas",pe2.getFullName());

        pe2.firstName = "Adityan";
        pe2.lastName = "Asokan";
        pe2.age = 78;
        pe2.salary = 10000;
        assertEquals("Age function inCorrect",false,pe2.isValidAge());
        assertEquals("Full name function is incorrect","Adityan Asokan",pe2.getFullName());
    }
}