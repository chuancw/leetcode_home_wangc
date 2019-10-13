package com.wangchuan.动态规划;

public class L_70_爬楼梯 {

    public static void main(String[] args) {
        System.out.println(new L_70_爬楼梯().climbStairs(3));
    }

    /**
     * 每次只能爬1步或者2步
     * 状态转移方程 f(n) 表示爬到n层需要多少种方法
     * f(n) = f(n-1) + f(n-2)
     */
    public int climbStairs(int n) {
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
