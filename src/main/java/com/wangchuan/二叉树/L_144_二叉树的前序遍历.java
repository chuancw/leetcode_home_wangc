package com.wangchuan.二叉树;

import java.util.ArrayList;
import java.util.List;

public class L_144_二叉树的前序遍历 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode r1 = new TreeNode(2);
        TreeNode r2 = new TreeNode(3);

        root.right = r1;
        r1.left = r2;

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            result.add(root.val);
            if (root.left != null) {
                helper(root.left, result);
            }
            if (root.right != null) {
                helper(root.right, result);
            }
        }
    }
}
