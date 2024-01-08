package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class EquivalenceClassTests {
    @Test
    public void EquivalenceClass1() {

        int[] response = new KMP().findAllOccurrences("xyxxzyxzy", "xx");

        assertNotNull(response);
        assertEquals(1, response.length);
        assertEquals(2, response[0]);

    }

    @Test
    public void EquivalenceClass2() {

        int[] response = new KMP().findAllOccurrences("xyxxzyxzy", "zy");

        assertNotNull(response);
        assertArrayEquals(new int[] { 4, 7 }, response);

    }

    @Test
    public void EquivalenceClass3() {

        int[] response = new KMP().findAllOccurrences("xyxxzyxzy", "zyz");

        assertNotNull(response);
        assertEquals(0, response.length);

    }

    @Test(expected = IllegalArgumentException.class)
    public void EquivalenceClass4Test1() {

        new KMP().findAllOccurrences("xxzxzy",  null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void EquivalenceClass4Test2() {

        new KMP().findAllOccurrences(null, "xy");
    }

    @Test(expected = IllegalArgumentException.class)
    public void EquivalenceClass4Test3() {

        new KMP().findAllOccurrences(null,  null);

    }
}
