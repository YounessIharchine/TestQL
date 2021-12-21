package org.example.ds.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTreatTest {

    OperationTreat operationTreat;

    @Before
    public void setUp() throws Exception {
        operationTreat = new OperationTreat();
    }

    @After
    public void tearDown() throws Exception {
        operationTreat = null;
    }

    @Test
    public void foundWhenArrayHasOneItem() {
        int[] tab = new int[1];
        tab[0] = 5;
        assertTrue(operationTreat.found(tab, 5));
        assertFalse(operationTreat.found(tab, 6));
    }

    @Test
    public void foundWhenItemIsLessThanFirstMiddle() {
        int[] tab = new int[5];
        tab[0] = 3;
        tab[1] = 4;
        tab[2] = 7;
        tab[3] = 9;
        tab[4] = 15;
        assertTrue(operationTreat.found(tab, 4));
        assertFalse(operationTreat.found(tab, 5));
    }

    @Test
    public void foundWhenItemIsGreaterThanFirstMiddle() {
        int[] tab = new int[5];
        tab[0] = 3;
        tab[1] = 4;
        tab[2] = 7;
        tab[3] = 9;
        tab[4] = 15;
        assertTrue(operationTreat.found(tab, 9));
        assertFalse(operationTreat.found(tab, 11));
    }

    @Test
    public void sumTwoPositiveNumbers() {
        assertEquals(17, operationTreat.sumTwoPositiveNumbers(8, 9));
        assertNotEquals(20, operationTreat.sumTwoPositiveNumbers(8, 9));
    }

    @Test
    public void sumTwoNonPositiveNumbers1() {
        try {
            operationTreat.sumTwoPositiveNumbers(-1, 9);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void sumTwoNonPositiveNumbers2() {
        try {
            operationTreat.sumTwoPositiveNumbers(8, -2);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void sumTwoNonPositiveNumbers3() {
        try {
            operationTreat.sumTwoPositiveNumbers(-1, -2);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }
}