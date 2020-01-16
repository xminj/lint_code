package com.xminj.lint.code.level_0;

/**
 * Count how many nodes in a linked list.
 * 计算链表中有多少个节点.
 *
 * Example 1:
 *      Input: 1->3->5->null
 *      Output:3
 * Example 2:
 *      Input:null
 *      Output:0
 */
public class CountLinkedList {

    private class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
            next = null;
        }
    }


    private int countNodes(ListNode head){
        int count = 0;
        if (head != null){
            count = 1; //头节点
            while (head.next != null){
                count++;
                head = head.next;
            }
        }
        return count;
    }

}
