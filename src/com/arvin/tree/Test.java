package com.arvin.tree;

public class Test {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        node.right = node1;
        node1.left = node2;
        //InorderTraversal.inorderTraversal(node).forEach(e -> System.out.println(e));
        PreorderTraversal.preorderTraversal1(node).forEach(e -> System.out.println(e));
    }
}
