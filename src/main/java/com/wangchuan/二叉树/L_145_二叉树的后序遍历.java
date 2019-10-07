package com.wangchuan.二叉树;

import java.util.ArrayList;
import java.util.List;

public class L_145_二叉树的后序遍历 {


    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, result);
            }
            if (root.right != null) {
                helper(root.right, result);
            }
            result.add(root.val);
        }
    }
}
