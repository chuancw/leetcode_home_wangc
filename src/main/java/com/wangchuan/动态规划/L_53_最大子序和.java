package com.wangchuan.动态规划;

import java.util.Arrays;

public class L_53_最大子序和 {

    /**
     * 动态规划
     * 状态转移方程   f(n) 表示以n为结尾的最长自序和
     * f(n) = max{f(n-1) + A[n] , A[n]}
     */
    public int maxSubArray(int[] nums) {
        int[] f = new int[nums.length];
        f[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            f[i] = Math.max(f[i - 1] + nums[i], nums[i]);
        }
        Arrays.sort(f);
        return f[f.length - 1];
    }
}
