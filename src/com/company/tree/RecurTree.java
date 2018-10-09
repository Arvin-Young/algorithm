package com.company.tree;

import java.util.LinkedList;
import java.util.Stack;

public class RecurTree {

    public static void main(String[] args) {
        TreeNode node0 = TreeNode.createTree();
        //preOrderRecur(node0);
        System.out.println();
        //preOrderTree(node0);
        //inOrderRecur(node0);
        System.out.println();
        //inOrderTree(node0);
        posOrderRecur(node0);
        System.out.println();
        posOrderTree1(node0);
    }

    /**
     * 递归实现 先序遍历：根、左、右
     * @param node
     */
    public static void preOrderRecur(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.val + "\t");
        preOrderRecur(node.left);
        preOrderRecur(node.right);
    }

    /**
     * 递归实现 中序遍历：左、根、右
     * @param node
     */
    public static void inOrderRecur(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderRecur(node.left);
        System.out.print(node.val + "\t");
        inOrderRecur(node.right);
    }

    /**
     * 递归实现 后序遍历：左、右、根
     * @param node
     */
    public static void posOrderRecur(TreeNode node) {
        if (node == null) {
            return;
        }

        posOrderRecur(node.left);
        posOrderRecur(node.right);
        System.out.print(node.val + "\t");
    }

    /**
     * 非递归方法实现先序遍历
     * @param node
     */
    public static void preOrderTree(TreeNode node) {
        if (node == null) { return; }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.val + "\t");
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    /**
     * 非递归形式的中序遍历
     * @param node
     */
    public static void inOrderTree(TreeNode node) {
        if (node == null) { return; }
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            }else {
                TreeNode temp = stack.pop();
                System.out.print(temp.val + "\t");
                node = temp.right;
            }
        }
    }

    /**
     * 非递归形式的后序遍历 一个栈实现
     * @param node
     */
    public static void posOrderTree1(TreeNode node) {
        if (node == null) { return; }
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        stack.push(node);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            list.addFirst(temp);
            if (temp.left != null) {stack.push(temp.left); }
            if (temp.right != null) { stack.push(temp.right); }
        }

        list.forEach(e -> System.out.print(e.val + "\t"));
        //list.getFirst();
    }

    /**
     * 非递归形式的后序遍历 双栈实现
     * @param node
     */
    public static void posOrderTree2(TreeNode node) {
        if (node == null) { return; }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(node);
        while (!stack1.isEmpty()) {
            TreeNode temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null) { stack1.push(temp.left); }
            if (temp.right != null) { stack1.push(temp.right); }
        }

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + "\t");
        }
    }
}
