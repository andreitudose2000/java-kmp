package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EquivalenceClassTests {
    @Test
    void EquivalenceClass1() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("xyxxzyxzy", "xx");

            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(2, response[0]);
        });
    }

    @Test
    void EquivalenceClass2() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("xyxxzyxzy", "zy");

            assertNotNull(response);
            assertArrayEquals(new int[] { 4, 7 }, response);
        });
    }

    @Test
    void EquivalenceClass3() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("xyxxzyxzy", "zyz");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void EquivalenceClass4() {
        assertThrows(IllegalArgumentException.class, () -> {
            KMP.findAllOccurrences("xxzxzy",  null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            KMP.findAllOccurrences(null,  "xy");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            KMP.findAllOccurrences(null,  null);
        });
    }
}
