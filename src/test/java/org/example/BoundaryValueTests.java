package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoundaryValueTests {
    @Test
    void BoundaryValue11() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("xyxxzyxzy", "xyx");

            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(0, response[0]);
        });
    }

    @Test
    void BoundaryValue12() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("xyxxzyxzy", "yxzy");

            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(5, response[0]);
        });
    }

    @Test
    void BoundaryValue13() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("exactly", "exactly");

            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(0, response[0]);
        });
    }

    @Test
    void BoundaryValue21() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("textoneonetext", "one");

            assertNotNull(response);
            assertEquals(2, response.length);
            assertArrayEquals(new int[] { 4, 7 }, response);
        });
    }

    @Test
    void BoundaryValue22() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("stringabababastring", "aba");

            assertNotNull(response);
            assertEquals(3, response.length);
            assertArrayEquals(new int[] { 6, 8, 10 }, response);
        });
    }

    @Test
    void BoundaryValue31() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("", "");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void BoundaryValue32() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("definitely not empty", "");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void BoundaryValue33() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("", "of course not empty");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void BoundaryValue34() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("abcdefghijk", "bcdefz");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void BoundaryValue35() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("Ana are mere", "Mere");

            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }
}
