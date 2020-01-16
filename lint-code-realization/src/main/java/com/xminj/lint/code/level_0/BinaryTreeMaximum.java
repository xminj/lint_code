package com.xminj.lint.code.level_0;

/**
 * Find the maximum node in a binary tree, return the node.
 * 在二叉树中寻找值最大的节点并返回。
 * Example 1:
 *      Input:{1,-5,3,1,2,-4,-5}
 *      Output:3
 */
public class BinaryTreeMaximum {
    private class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public TreeNode maxNode(TreeNode root) {
        TreeNode max = null;
        if (root != null) {
            max = helperMaxNode(root);
        }
        return max;
    }

    private TreeNode helperMaxNode(TreeNode root) {
        if (root.left == null && root.right == null) return root;
        TreeNode maxNode = root;
        if (root.left != null)
            maxNode = max(maxNode, helperMaxNode(root.left));
        if (root.right != null)
            maxNode = max(maxNode,helperMaxNode(root.right));
        return maxNode;
    }

    private TreeNode max(TreeNode maxNode, TreeNode helperMaxNode) {
        return maxNode.val > helperMaxNode.val ? maxNode:helperMaxNode;
    }

}
