package leetcode.problems._2196_create_binary_tree_from_descriptions;

import leetcode.common.TreeNode;

import java.util.*;

class Solution {

    private final Map<Integer, TreeNode> treeNodeMap = new HashMap<>();
    private final Map<Integer, Integer> parentMap = new HashMap<>();

    public TreeNode createBinaryTree(int[][] descriptions) {

        for (int[] description : descriptions) {
            TreeNode node = getTreeNode(description[0]);
            putChildTreeNode(node, description);
        }

        int value = descriptions[0][0];
        while (parentMap.containsKey(value)) {
            value = parentMap.get(value);
        }
        return treeNodeMap.get(value);
    }

    private TreeNode getTreeNode(int value) {
        if (treeNodeMap.containsKey(value)) {
            return treeNodeMap.get(value);
        }
        TreeNode node = new TreeNode(value);
        treeNodeMap.put(value, node);
        return node;
    }

    private void putChildTreeNode(TreeNode parent, int[] description) {
        TreeNode child = getTreeNode(description[1]);
        if (description[2] == 1) {
            parent.left = child;
        } else {
            parent.right = child;
        }
        parentMap.put(child.val, parent.val);
    }
}
