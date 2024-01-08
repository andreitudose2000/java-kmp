package org.example;

import org.junit.*;

import static org.junit.Assert.*;

public class CauseEffectGraphingTests {
    @Test
    public void CauseEffectGraph1() {

        int[] response = new KMP().findAllOccurrences("abcacbac", "ac");

        assertNotNull(response);
        assertArrayEquals(new int[] { 3, 6 }, response);

    }

    @Test
    public void CauseEffectGraph2() {

        int[] response = new KMP().findAllOccurrences("bcacabcb", "ba");

        assertNotNull(response);
        assertEquals(0, response.length);

    }

    @Test(expected = IllegalArgumentException.class)
    public void CauseEffectGraph3() {

        new KMP().findAllOccurrences(null,  null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void CauseEffectGraph4() {

        new KMP().findAllOccurrences("abccab",  null);

    }

    @Test(expected = IllegalArgumentException.class)
    public void CauseEffectGraph5() {

        new KMP().findAllOccurrences(null, "bca");

    }
}
