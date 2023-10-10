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
    ArrayList<Integer> listNode1 = new ArrayList<>();
    ArrayList<Integer> listNode2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        listNode1 = findLeafNode(root1, listNode1);
        listNode2 = findLeafNode(root2, listNode2);

        return listNode1.equals(listNode2);
    }

    public ArrayList<Integer> findLeafNode(TreeNode node, ArrayList<Integer> list) {
        if (node == null) {
            return null;
        }

        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        findLeafNode(node.left, list);
        findLeafNode(node.right, list);

        return list;
    }   
}