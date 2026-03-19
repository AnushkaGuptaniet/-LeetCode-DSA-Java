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
class Solution {
    
    int preIndex = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        return construct(preorder, 0, inorder.length - 1, map);
    }
    
    public TreeNode construct(int[] preorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        
        if(inStart > inEnd) return null;
        
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        
        int inIndex = map.get(rootVal);
        
        root.left = construct(preorder, inStart, inIndex - 1, map);
        
        root.right = construct(preorder, inIndex + 1, inEnd, map);
        
        return root;
    }
}
