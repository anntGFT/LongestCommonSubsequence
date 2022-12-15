package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    String text1, text2;
    int result;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void noSubsequences(){

        text1 = "abc";
        text2 = "def";

        result = 0;

        assertEquals(result, solution.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void subsequenceOfLength3(){

        text1 = "abcdef";
        text2 = "acd";

        result = 3;

        assertEquals(result, solution.longestCommonSubsequence(text1, text2));
    }

    @Test
    public void subsequenceOfLength5(){

        text1 = "abcdefghijklmnopqrstuvwxyz";
        text2 = "afity";

        result = 5;

        assertEquals(result, solution.longestCommonSubsequence(text1, text2));
    }
}
