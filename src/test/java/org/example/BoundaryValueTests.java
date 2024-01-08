package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class BoundaryValueTests {
    @Test
    public void BoundaryValue11() {

        int[] response = new KMP().findAllOccurrences("xyxxzyxzy", "xyx");

        assertNotNull(response);
        assertEquals(1, response.length);
        assertEquals(0, response[0]);

    }

    @Test
    public void BoundaryValue12() {

        int[] response = new KMP().findAllOccurrences("xyxxzyxzy", "yxzy");

        assertNotNull(response);
        assertEquals(1, response.length);
        assertEquals(5, response[0]);

    }

    @Test
    public void BoundaryValue13() {

        int[] response = new KMP().findAllOccurrences("exactly", "exactly");

        assertNotNull(response);
        assertEquals(1, response.length);
        assertEquals(0, response[0]);

    }

    @Test
    public void BoundaryValue21() {

        int[] response = new KMP().findAllOccurrences("textoneonetext", "one");

        assertNotNull(response);
        assertEquals(2, response.length);
        assertArrayEquals(new int[] { 4, 7 }, response);

    }

    @Test
    public void BoundaryValue22() {

        int[] response = new KMP().findAllOccurrences("stringabababastring", "aba");

        assertNotNull(response);
        assertEquals(3, response.length);
        assertArrayEquals(new int[] { 6, 8, 10 }, response);

    }

    @Test
    public void BoundaryValue31() {

        int[] response = new KMP().findAllOccurrences("", "");

        assertNotNull(response);
        assertEquals(0, response.length);

    }

    @Test
    public void BoundaryValue32() {

        int[] response = new KMP().findAllOccurrences("definitely not empty", "");

        assertNotNull(response);
        assertEquals(0, response.length);

    }

    @Test
    public void BoundaryValue33() {

        int[] response = new KMP().findAllOccurrences("", "of course not empty");

        assertNotNull(response);
        assertEquals(0, response.length);

    }

    @Test
    public void BoundaryValue34() {

        int[] response = new KMP().findAllOccurrences("abcdefghijk", "bcdefz");

        assertNotNull(response);
        assertEquals(0, response.length);

    }

    @Test
    public void BoundaryValue35() {

        int[] response = new KMP().findAllOccurrences("Ana are mere", "Mere");

        assertNotNull(response);
        assertEquals(0, response.length);

    }
}
