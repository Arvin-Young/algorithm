package com.arvin.list;

public class Node {
    public int value;
    public Node next;
    public Node(int value) {
        this.value = value;
    }

    public Node(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        this.value = arr[0];
        Node cur = this;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            cur.next = node;
            cur = node;
        }
    }

    public void print() {
        Node cur = this;
        while (cur != null) {
            System.out.print(cur.value + "->");
            cur = cur.next;
        }
        System.out.println("NULL");
    }
}
