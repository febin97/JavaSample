package com.stackroute;

import org.junit.*;
import static org.junit.Assert.*;

public class PowerFourTest {
    private static PowerFour pe2;
    @Before
    public void setUp() throws Exception {
        pe2 = new PowerFour();
    }

    @After
    public void tearDown() throws Exception {
        pe2 = null;
    }

    @Test
    public void testPowerFour() {
        assertEquals("PowerFour() not working ",true,pe2.checkPowerFour(64));
        assertEquals("PowerFour() not working ",false,pe2.checkPowerFour(32));
        assertEquals("PowerFour() not working ",true,pe2.checkPowerFour(1));
        assertEquals("PowerFour() not working ",false,pe2.checkPowerFour(0));
    }
}
