package com.wangchuan.动态规划;

public class L_62_不同路径 {

    /**
     * 给定 M x N的方格, 问多少种走到右下角
     * 状态转移方程： f(m)(n) = f(m-1)(n) + f(m)(n-1)
     *
     * 边界条件： f(0)(0)=1
     *           f(0)(n)=1
     *           f(m)(0)=1
     *
     */
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        f[0][0]=1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    f[i][j] =1;
                    continue;
                }
                f[i][j] = f[i - 1][j] + f[i][j - 1];
            }
        }
        return f[m - 1][n - 1];
    }
}
