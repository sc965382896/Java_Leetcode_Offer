package LeetCode;

// 二叉树的深度
// 前序遍历

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftL = maxDepth(root.left);
        int rightL = maxDepth(root.right);
        return leftL > rightL ? leftL + 1 : rightL + 1;
    }
}
