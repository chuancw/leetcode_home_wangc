package com.wangchuan.搜索.BFS;

import com.wangchuan.二叉树.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTest {

    public static void main(String[] args) {

        /**
         *       1
         *    2     3
         *  4  5  6  7
         */
        TreeNode head = TreeNode.getInstance();
        new BFSTest().bfs(head);
    }

    /**
     * 使用队列，实现广度优先搜索
     * @param head
     */
    public void bfs(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            TreeNode firstNode = queue.poll();
            System.out.print(firstNode.val);
            if (firstNode.left != null) {
                queue.add(firstNode.left);
            }
            if (firstNode.right != null) {
                queue.add(firstNode.right);
            }
        }
    }
}
