package com.wangchuan.二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * 中序遍历，看结果是否是回文数
 */
public class L_101_对称二叉树 {


    public boolean isSymmetric(TreeNode root) {
        List<String> result = new ArrayList<>();
        int level = 0;
        helper(root, result, level);
        return isHuiwen(result);

    }


    /**
     * 为了防止解决重复也是回文数的情况，需要添加层数
     * @param root
     * @param result
     * @param level
     */
    private void helper(TreeNode root, List<String> result, int level) {
        if (root != null) {

            if (root.left != null) {
                helper(root.left, result, level+1);
            }
            result.add(root.val+"." + level);
            if (root.right != null) {
                helper(root.right, result, level+1);
            }
        }
    }

    private boolean isHuiwen(List<String> result) {
        for (int i = 0; i < result.size() / 2; i++) {
            if (!result.get(i).equals(result.get(result.size() - i - 1))) {
                return false;
            }
        }
        return true;
    }
}
