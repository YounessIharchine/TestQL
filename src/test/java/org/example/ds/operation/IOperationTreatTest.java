package org.example.ds.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

public class IOperationTreatTest {

    IOperationTreat iOperationTreat;

    @Before
    public void setUp() throws Exception {
        iOperationTreat = mock(IOperationTreat.class);
    }

    @After
    public void tearDown() throws Exception {
        iOperationTreat = null;
    }

    @Test
    public void foundWhenArrayHasOneItem() {
        int[] tab = new int[1];
        tab[0] = 5;

        when(iOperationTreat.found(tab, 5)).thenReturn(true);
        when(iOperationTreat.found(tab, 6)).thenReturn(false);

        assertTrue(iOperationTreat.found(tab, 5));
        assertFalse(iOperationTreat.found(tab, 6));
    }

    @Test
    public void foundWhenItemIsLessThanFirstMiddle() {
        int[] tab = new int[5];
        tab[0] = 3;
        tab[1] = 4;
        tab[2] = 7;
        tab[3] = 9;
        tab[4] = 15;

        when(iOperationTreat.found(tab, 4)).thenReturn(true);
        when(iOperationTreat.found(tab, 5)).thenReturn(false);

        assertTrue(iOperationTreat.found(tab, 4));
        assertFalse(iOperationTreat.found(tab, 5));
    }

    @Test
    public void foundWhenItemIsGreaterThanFirstMiddle() {
        int[] tab = new int[5];
        tab[0] = 3;
        tab[1] = 4;
        tab[2] = 7;
        tab[3] = 9;
        tab[4] = 15;

        when(iOperationTreat.found(tab, 9)).thenReturn(true);
        when(iOperationTreat.found(tab, 11)).thenReturn(false);


        assertTrue(iOperationTreat.found(tab, 9));
        assertFalse(iOperationTreat.found(tab, 11));
    }

    @Test
    public void sumTwoPositiveNumbers() {
    }
}