package com.wangchuan.链表;

public class L_83_删除排序链表中的重复节点_保留一个 {

    public static void main(String[] args) {
        ListNode c1 = new ListNode(1);
        ListNode c2 = new ListNode(2);
        ListNode c3 = new ListNode(2);
        c1.next = c2;
        c2.next = c3;
        System.out.println(new L_83_删除排序链表中的重复节点_保留一个().deleteDuplicates(c1));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val != temp.next.val) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }
}
