package com.wangchuan.二叉树;

/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class L_98_验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {
        if (root != null) {

            if (root.left != null) {
                if (root.left.val >= root.val) {
                    return false;
                }
            }
            if (root.right != null) {
                if (root.right.val <= root.val) {
                    return false;
                }
            }
            return isValidBST(root.left) && isValidBST(root.right);
        }
        return true;

    }
}
