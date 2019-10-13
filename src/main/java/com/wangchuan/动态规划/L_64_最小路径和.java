package com.wangchuan.动态规划;

public class L_64_最小路径和 {

    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    grid[0][j] += grid[0][j - 1];
                    continue;
                }
                if (j == 0) {
                    grid[i][0] += grid[i - 1][0];
                    continue;
                }

                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[row-1][column-1];
    }
}
