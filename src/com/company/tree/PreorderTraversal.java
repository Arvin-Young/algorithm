package com.company.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {
    static List<Integer> list = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        if ( root != null ) {
            list.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }

        return list;
    }

    public static List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) { return res; }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        stack.push(node);
        while (!stack.empty()) {
            node = stack.pop();
            res.add(node.val);
            if (node.right != null) { stack.push(node.right); }
            if (node.left != null) { stack.push(node.left); }
        }
        return res;
    }
}
