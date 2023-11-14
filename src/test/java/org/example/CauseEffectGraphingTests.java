package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CauseEffectGraphingTests {
    @Test
    void CauseEffectGraph1() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("abcacbac", "ac");

            assertNotNull(response);
            assertArrayEquals(new int[] { 3, 6 }, response);
        });
    }

    @Test
    void CauseEffectGraph2() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("bcacabcb", "ba");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void CauseEffectGraph3() {
        assertThrows(IllegalArgumentException.class, () -> {
            KMP.findAllOccurrences(null,  null);
        });
    }

    @Test
    void CauseEffectGraph4() {
        assertThrows(IllegalArgumentException.class, () -> {
            KMP.findAllOccurrences("abccab",  null);
        });
    }

    @Test
    void CauseEffectGraph5() {
        assertThrows(IllegalArgumentException.class, () -> {
            KMP.findAllOccurrences(null, "bca");
        });
    }
}
