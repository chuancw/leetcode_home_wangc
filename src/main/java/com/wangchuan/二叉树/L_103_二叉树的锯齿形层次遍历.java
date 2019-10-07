package com.wangchuan.二叉树;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 如果层次数是奇数，则反转List
 */
public class L_103_二叉树的锯齿形层次遍历 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Map<Integer, List<Integer>> result = new HashMap<>();
        helper(root, 0, result);
        List<List<Integer>> rlt = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : result.entrySet()) {
            List<Integer> value = entry.getValue();
            if (entry.getKey() % 2 != 0) {
                value = reverseList(value);
            }
            rlt.add(value);

        }
        return rlt;
    }

    /**
     * 先序遍历
     * @param root
     * @param level
     * @param result
     */
    private void helper(TreeNode root, int level, Map<Integer, List<Integer>> result) {
        if (root != null) {
            List<Integer> integers = result.get(level);
            if (integers == null) {
                integers = new ArrayList<>();
            }
            integers.add(root.val);
            result.put(level, integers);

            if (root.left != null) {
                helper(root.left, level +1, result);
            }
            if (root.right != null) {
                helper(root.right, level+1, result);
            }
        }
    }

    private List<Integer> reverseList(List<Integer> jishuResult) {
        List<Integer> result = new ArrayList<>();
        for (int i = jishuResult.size() - 1; i >= 0; i--) {
            result.add(jishuResult.get(i));
        }
        return result;
    }
}
