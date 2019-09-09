package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks pe2;

    @Before
    public void setUp() throws Exception {
        pe2 = new StudentMarks();
    }
    @After
    public void tearDown() throws Exception {
        pe2 = null;
    }
    @Test
    public void testStudentMarks() {
        int[] arrTest = {86,65,98,77};
        int noTest = 4;
        assertEquals("Average Function not Correct",81.50,pe2.getAvg(arrTest,noTest),2);
        assertEquals("Minimum Function not Correct",65,pe2.getMin(arrTest,noTest));
        assertEquals("Max Function not Correct",98,pe2.getMax(arrTest,noTest));
        assertEquals("Output Format not Correct","The average is 81.5\n" +
                "The minimum is 65\n" +
                "The maximum is 98",pe2.returnOutput(arrTest,noTest));
    }
}