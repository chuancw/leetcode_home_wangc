package com.wangchuan.队列;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek() == 1);
        System.out.println(queue.peek() == 1);
        System.out.println(queue.poll() == 1);
        System.out.println(queue.poll() == 2);
        System.out.println(queue.poll() == 3);
    }
}
