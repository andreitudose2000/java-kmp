package org.example;

import lombok.Generated;
import org.javatuples.Pair; import java.util.ArrayList; import java.util.Comparator;import java.util.TreeMap;


public class KMP {
    public static int[] findAllOccurrences(String text, String pattern)
    { Init();
        if (text == null) {
            coverage.put(new Pair<>(10, 'T'), true);throw new IllegalArgumentException("Text can not be null");
        }
        coverage.put(new Pair<>(10, 'F'), true);if (pattern == null) {
        coverage.put(new Pair<>(13, 'T'), true);throw new IllegalArgumentException("Pattern can not be null");
        }

        coverage.put(new Pair<>(13, 'F'), true);var m = pattern.length();
        var n = text.length();

        if (m == 0 || n == 0 || m > n) {
            coverage.put(new Pair<>(20, 'T'), true); return new int[0];
        }

        coverage.put(new Pair<>(20, 'F'), true); var lpsArray = getLPSArray(pattern);

        var foundAt = new ArrayList<Integer>();

        int textIndex = 0, patternIndex = 0;
        while ((m - patternIndex) <= (n - textIndex)) {
            coverage.put(new Pair<>(29, 'T'), true); if (pattern.charAt(patternIndex) == text.charAt(textIndex)) {
                coverage.put(new Pair<>(30, 'T'), true);patternIndex += 1;
                textIndex += 1;
            }
            coverage.put(new Pair<>(30, 'F'), true);if (patternIndex == m) {
                coverage.put(new Pair<>(34, 'T'), true);foundAt.add(textIndex - patternIndex);
                patternIndex = lpsArray[patternIndex - 1];
            }

            else { coverage.put(new Pair<>(34, 'F'), true); if (textIndex < n && pattern.charAt(patternIndex) != text.charAt(textIndex)) {
                coverage.put(new Pair<>(39, 'T'), true); if (patternIndex != 0) {
                    coverage.put(new Pair<>(40, 'T'), true);patternIndex = lpsArray[patternIndex - 1];
                }
                else {
                    coverage.put(new Pair<>(40, 'F'), true);textIndex += 1;
                }
            } else{ coverage.put(new Pair<>(39, 'F'), true);}}
        }

        coverage.put(new Pair<>(29, 'F'), true);return foundAt.stream().mapToInt(Number::intValue).toArray();
    }

    private static int[] getLPSArray(String pattern) {
        int m = pattern.length();

        int[] lps_array = new int[m];
        lps_array[0] = 0;

        int suffix_length = 0;
        int index = 1;

        while (index < m) {
            coverage.put(new Pair<>(61, 'T'), true);if (pattern.charAt(index) == pattern.charAt(suffix_length)) {
                coverage.put(new Pair<>(62, 'T'), true);suffix_length++;
                lps_array[index] = suffix_length;
                index++;
            }
            else
            {
                coverage.put(new Pair<>(62, 'F'), true);if (suffix_length != 0) {
                coverage.put(new Pair<>(69, 'T'), true);suffix_length = lps_array[suffix_length - 1];
                }
                else {
                coverage.put(new Pair<>(69, 'F'), true);lps_array[index] = suffix_length;
                    index++;
                }
            }
        }

        coverage.put(new Pair<>(61, 'F'), true);return lps_array;
    }

    //public static HashMap<Pair<Integer, Character>, Boolean> coverage = new HashMap<>();

    private static void Init() {
        int[] integers = {10, 13, 20, 29, 30, 34, 39, 40, 61, 62, 69};
        char[] characters = {'T', 'F'};

        for (int integer : integers) {
            for (char character : characters) {
                coverage.put(new Pair<>(integer, character), Boolean.FALSE);
            }
        }
    }

    // Creating a TreeMap with a custom comparator
    public static TreeMap<Pair<Integer, Character>, Boolean> coverage = new TreeMap<>(new Comparator<Pair<Integer, Character>>() {
        @Override
        public int compare(Pair<Integer, Character> o1, Pair<Integer, Character> o2) {
            int cmp = Integer.compare(o1.getValue0(), o2.getValue0());
            if (cmp != 0) {
                return cmp; // Sort by key integer in ascending order
            } else {
                // Sort by key character in descending order
                return Character.compare(o2.getValue1(), o1.getValue1());
            }
        }
    });

    @Generated
    public static void main(String[] args)
    {
        // exemplu:

        int[] result = KMP.findAllOccurrences("aefafefeefra", "fra");
        for (int index : result) {
            System.out.println(index);
        }
    }
}

