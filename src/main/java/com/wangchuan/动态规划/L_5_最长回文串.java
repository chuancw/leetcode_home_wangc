package com.wangchuan.动态规划;

public class L_5_最长回文串 {

    public String longestPalindrome(String s) {
        int size = s.length();
        boolean[][] f = new boolean[size][size];

        int maxSize = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                // 长度为2或者1的时候，比如 ab  a 判断是否是回文
                if (i - j < 2) {
                    f[i][j] = s.charAt(i) == s.charAt(j);
                } else {
                    f[i][j] = f[i+1][j-1] && s.charAt(i) == s.charAt(j);
                }

            }
        }
        return "";
    }
}
