//删除链表中重复的节点。

import java.util.Scanner;

public class Main {
    public static void main(String[] argc) {
        Scanner in = new Scanner(System.in);
        Node head = new Node(0);
        Node p = head;
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            Node next = new Node(val);
            p.next = next;
            p = p.next;
        }
        p.next = null;

        deleteRepeatNode(head);
        printNode(head);
    }

    public static class Node {
        public Node(int val) {
            this.val = val;
        }

        public int val;
        public Node next;
    }

    public static void deleteRepeatNode(Node head) {
        Node pre;
        Node temp;
        Node current;
        temp = head;
        pre = head;
        current = head.next;
        boolean deleteFlag=false;
        while (current != null) {
            if (pre.val == current.val) {
                current = current.next;
                deleteFlag=true;
            } else {
                if(deleteFlag) {
                    temp.next = current;
                    pre = current;
                    current = current.next;
                    deleteFlag=false;
                }else{
                    deleteFlag=false;
                    temp=pre;
                    pre=current;
                    current=current.next;
                }
            }
        }
    }

    public static void printNode(Node head) {
        Node p = head.next;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
