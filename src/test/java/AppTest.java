package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testEligibleStudent() {
        assertTrue(App.isEligible(85, 200000, "SC"));
    }

    @Test
    public void testLowMarks() {
        assertFalse(App.isEligible(60, 200000, "OBC"));
    }

    @Test
    public void testHighIncome() {
        assertFalse(App.isEligible(80, 300000, "ST"));
    }

    @Test
    public void testGeneralCategory() {
        assertFalse(App.isEligible(90, 100000, "General"));
    }
}