package com.arvin.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        node.right = node1;
        node1.left = node2;
        inorderTraversal(node).forEach(e -> System.out.println(e));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) { return list; }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode leftNode = root;
        while (leftNode != null) {
            stack.push(leftNode);
            leftNode = leftNode.left;
        }
        while (!stack.empty()) {
            TreeNode temp = stack.pop();
            list.add(temp.val);
            TreeNode node = temp.right;
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }
        return list;
    }
}
