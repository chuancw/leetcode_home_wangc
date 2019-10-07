package com.wangchuan.链表;

public class L_82_删除排序链表中的重复元素 {

    public static void main(String[] args) {
        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(1);
        ListNode c3 = new ListNode(2);
        ListNode c4 = new ListNode(3);
        ListNode c5 = new ListNode(4);
        ListNode c6 = new ListNode(4);

        c1.next = c2;
        c2.next = c3;
        c3.next = c4;
        c4.next = c5;
        c5.next = c6;


        System.out.println(new L_82_删除排序链表中的重复元素().deleteDuplicates(c1));

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode headNode = new ListNode(-1);
        ListNode temp = headNode;
        boolean flag = false;
        if (head == null || head.next == null) {
            return head;
        }


        while (head.next != null) {
            while (head.next !=null && head.val == head.next.val) {
                head = head.next;
                flag = true;
            }
            if (flag) {
                head = head.next;
                flag = false;
            }
            if (head ==null || head.next == null) {
                temp.next = head;
                return headNode.next;
            }
            if (head.val != head.next.val) {
                temp.next = head;
                //临时指针移动
                temp = temp.next;
                //自己移动
                head = head.next;
            }
        }

        return headNode.next;
    }
}
