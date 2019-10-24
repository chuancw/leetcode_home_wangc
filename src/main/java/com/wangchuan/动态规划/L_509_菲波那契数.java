package com.wangchuan.动态规划;

public class L_509_菲波那契数 {

    public static void main(String[] args) {
        System.out.println(new L_509_菲波那契数().fib(30));
    }

    /**
     * 递归写法  O(2^N)
     * @param N
     * @return
     */
    public int fib_digui(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return fib_digui(N - 1) + fib_digui(N - 2);
    }

    /**
     * 动态规划
     * 状态转移方程 dp(x) = dp(x-1) + dp(x-2)
     * 初始条件  dp(0) = 0; dp(1) = 1
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[N];
    }
}
