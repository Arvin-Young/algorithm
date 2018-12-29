package com.arvin.tree;

import sun.reflect.generics.tree.Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public TreeNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        TreeNode node = this;
        for (int i = 0; i < arr.length; ) {
            node = createTree(node, i, arr);

        }
    }



    public TreeNode createTree(TreeNode node, int index, int[] arr) {
        if (index >= arr.length) {
            return null;
        }
        node = new TreeNode(arr[index]);
        node.left = ++index >= arr.length ? null : new TreeNode(arr[index]);
        node.right = ++index > arr.length ? null : new TreeNode(arr[index]);
        return node;
    }

    public static TreeNode createTree() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        TreeNode node0 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(5);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(7);

        node0.left = node1;
        node0.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        return node0;
    }
}
