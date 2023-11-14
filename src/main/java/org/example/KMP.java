package org.example;

import lombok.Generated;

import java.util.ArrayList;

public class KMP {
    public static int[] findAllOccurrences(String text, String pattern)
    {
        if (text == null) {
            throw new IllegalArgumentException("Text can not be null");
        }
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern can not be null");
        }

        var m = pattern.length();
        var n = text.length();

        if (m == 0 || n == 0 || m > n) {
            return new int[0];
        }

        var lpsArray = getLPSArray(pattern);

        var foundAt = new ArrayList<Integer>();

        int textIndex = 0, patternIndex = 0;
        while ((m - patternIndex) <= (n - textIndex)) {
            if (pattern.charAt(patternIndex) == text.charAt(textIndex)) {
                patternIndex += 1;
                textIndex += 1;
            }
            if (patternIndex == m) {
                foundAt.add(textIndex - patternIndex);
                patternIndex = lpsArray[patternIndex - 1];
            }

            else if (textIndex < n && pattern.charAt(patternIndex) != text.charAt(textIndex)) {
                if (patternIndex != 0) {
                    patternIndex = lpsArray[patternIndex - 1];
                }
                else {
                    textIndex += 1;
                }
            }
        }

        return foundAt.stream().mapToInt(Number::intValue).toArray();
    }

    private static int[] getLPSArray(String pattern) {
        int m = pattern.length();

        int[] lps_array = new int[m];
        lps_array[0] = 0;

        int suffix_length = 0;
        int index = 1;

        while (index < m) {
            if (pattern.charAt(index) == pattern.charAt(suffix_length)) {
                suffix_length++;
                lps_array[index] = suffix_length;
                index++;
            }
            else
            {
                if (suffix_length != 0) {
                    suffix_length = lps_array[suffix_length - 1];
                }
                else {
                    lps_array[index] = suffix_length;
                    index++;
                }
            }
        }

        return lps_array;
    }

    @Generated
    public static void main(String[] args)
    {
        // exemplu:

        int[] result = KMP.findAllOccurrences("dsx", "dsxdfafefaedsxeraedsx");
        for (int index : result) {
            System.out.println(index);
        }
    }
}

