package com.arvin.tree;

public class Test {
    public static void main(String[] args) {
       BST<Integer> bst = new BST<>();
       int[] array = {5, 2, 6, 3, 7, 9};
       for (int i = 0; i < array.length; i++) {
           bst.add(array[i]);
       }
       System.out.println(bst.size());
       bst.preOrder();
       System.out.println();
       bst.inOrder();
       System.out.println();
       bst.postOrder();
    }
}
