//删除链表中的节点。

import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        Node head = new Node(0);
        Node p = head;
        Node delete = null;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            Node next = new Node(val);
            p.next = next;
            p = p.next;
        }
        p.next = null;

        int deleteVal = in.nextInt();
        delete = new Node(deleteVal);
        deleteNode(head, delete);
        printNode(head);
    }

    public static class Node {
        public Node(int val) {
            this.val = val;
        }

        public int val;
        public Node next;
    }

    public static boolean deleteNode(Node head, Node delete) {
        Node pre;
        Node next;
        Node current;
        pre = null;
        current = head;
        next = head.next;
        while (current != null) {
            if (current.val == delete.val) {
                if (current.next != null) {
                    pre.next = next;
                } else {
                    pre.next = null;
                }
                current = null;
                next = null;
                return true;
            } else {
                pre = current;
                current = current.next;
                next = current.next;
            }
        }
        return false;
    }

    public static void printNode(Node head) {
        Node p = head.next;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
