package com.company.list;

public class PrintCommonPart {
    public static void main(String[] args) {
        Node head1 = new Node(new int[]{1, 2, 5, 7});
        Node head2 = new Node(new int[]{2, 4, 5, 9});
        printCommonPart(head1, head2);
    }

    public static void printCommonPart(Node head1, Node head2) {
        System.out.println("print common part:");
        while (head1 != null && head2 != null) {
            if (head1.value < head2.value) {
                head1 = head1.next;
            }else if (head1.value > head2.value) {
                head2 = head2.next;
            }else {
                System.out.print(head1.value + " ");
                head1 = head1.next;
                head2 = head2.next;
            }
        }
    }
}
