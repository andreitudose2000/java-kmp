package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MCDCTests {

    @Test
    void MCDC20_1() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("abc", "a");

            DisplayCoverage();
            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(0, response[0]);
        });
    }

    @Test
    void MCDC20_2() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("abc", "");

            DisplayCoverage();
            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void MCDC20_4() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("ad", "longer");

            DisplayCoverage();
            assertNotNull(response);
            assertEquals(0, response.length);
        });
    }

    @Test
    void MCDC39_Conditions() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("aefafefeefra", "fra");

            DisplayCoverage();
            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(9, response[0]);
        });
    }

    @Test
    void MCDC10_True() {
        assertThrows(IllegalArgumentException.class, () -> {
            try{
                KMP.findAllOccurrences(null, "fra");
            } catch(Exception e) {
                DisplayCoverage();
                throw e;
            }
        });
    }

    @Test
    void MCDC13_True() {
        assertThrows(IllegalArgumentException.class, () -> {
            try{
                KMP.findAllOccurrences("xyz", null);
            } catch(Exception e) {
                DisplayCoverage();
                throw e;
            }
        });
    }

    @Test
    void MCDC62_True() {
        assertDoesNotThrow(() -> {
            var response = KMP.findAllOccurrences("ABABXABABDABABCABAB", "ABABCABAB");

            DisplayCoverage();
            assertNotNull(response);
            assertEquals(1, response.length);
            assertEquals(10, response[0]);
        });
    }

    private void DisplayCoverage() {
        for(var entry : KMP.coverage.entrySet()){
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }
    }

}
