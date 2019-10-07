package com.wangchuan.链表;

public class L_21_合并两个有序链表 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        ListNode r1 = new ListNode(2);
        ListNode r2 = new ListNode(5);
        ListNode r3 = new ListNode(6);
        r1.next = r2;
        r2.next = r3;

        ListNode listNode = new L_21_合并两个有序链表().mergeTwoLists(l1, r1);
        System.out.println(listNode);


    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode tempFirst = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tempFirst.next = l1;
                l1 = l1.next;
            } else {
                tempFirst.next = l2;
                l2 = l2.next;
            }
            tempFirst = tempFirst.next;
        }

        if (l1 == null) {
            tempFirst.next = l2;
        } else {
            tempFirst.next = l1;
        }

        return head.next;
    }




}
