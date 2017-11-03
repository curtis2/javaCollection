package com.simon.collection.collection;

import java.util.PriorityQueue;

/**
 * auther: Simon zhang
 * Emaill:18292967668@163.com
 */

public class PriorityQueueTest {

    public static void main(String[] args) {
        //默认排序从小到大
        PriorityQueue queue=new PriorityQueue();
        queue.add(1);
        queue.add(3);
        queue.add(2);

        //取出队列头部元素
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
