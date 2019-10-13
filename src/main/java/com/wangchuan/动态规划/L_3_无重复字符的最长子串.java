package com.wangchuan.动态规划;

import java.util.Arrays;

public class L_3_无重复字符的最长子串 {

    /**
     * 动态规划
     * 状态转移方程： f(i) 表示前i个子字符串最长无重复长度
     * f(i) = f(i-1) + [第i个字符是否在前面]
     *
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.trim().length() == 0) {
            return 1;
        }
        int[] f = new int[s.length()];
        f[0] = 1;
        int index = 0;
        for (int i = 1; i < s.length(); i++) {
            String s1 = String.valueOf(s.charAt(i));
            if (s.substring(index,i).contains(s1)) {
                //这里很重要 index代表前index到i-1的子串中最后一个重复字符的下一个索引
                index = s.substring(index, i).lastIndexOf(s1) +1 + index;
                //f[i] 为截取之后的长度
                f[i] = i - index +1;
            } else{
                f[i] = f[i-1] +1;
            }
        }
        Arrays.sort(f);
        return f[s.length() - 1];
    }
}
