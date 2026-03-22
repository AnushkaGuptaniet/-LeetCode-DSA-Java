/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

public class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int postIndex;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // Map me inorder ke values ka index store kar lo
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        postIndex = postorder.length - 1;

        return helper(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode helper(int[] inorder, int[] postorder, int left, int right) {
        if (left > right) return null;

        // Root element (postorder se)
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);

        // Inorder me root ka index
        int index = map.get(rootVal);

        // IMPORTANT: Pehle right subtree banta hai
        root.right = helper(inorder, postorder, index + 1, right);
        root.left = helper(inorder, postorder, left, index - 1);

        return root;
    }
}
