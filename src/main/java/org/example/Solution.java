package org.example;

public class Solution {
    public Solution(){

    }

    public int longestCommonSubsequence(String text1, String text2){

        int m = text1.length(), n = text2.length();
        int[][] aux = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {

                    aux[i][j] = 1 + aux[i - 1][j - 1];
                } else {

                    aux[i][j] = Math.max(aux[i - 1][j], aux[i][j - 1]);
                }
            }
        }

        return aux[m][n];
    }
}