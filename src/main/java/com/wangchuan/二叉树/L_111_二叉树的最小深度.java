package com.wangchuan.二叉树;


import java.util.LinkedList;
import java.util.Queue;

public class L_111_二叉树的最小深度 {

    public static void main(String[] args) {
        TreeNode head = TreeNode.getInstance();
        System.out.println(new L_111_二叉树的最小深度().minDepth(head));
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            level++;
            //叶子节点
            if (poll.right == null && poll.left == null) {
                break;
            }
            if (poll.right != null) {
                queue.add(poll.right);
            }
            if (poll.left != null) {
                queue.add(poll.left);
            }
        }
        return level;
    }
}
