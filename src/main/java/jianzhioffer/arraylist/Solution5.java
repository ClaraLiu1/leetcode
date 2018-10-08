package jianzhioffer.arraylist;

/**
 * Author 范群松.
 * Date：2018/8/19
 * Time: 14:37
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class Solution5 {
    public ListNode FindKthToTail(ListNode head,int k) {
        int count = 0;
        ListNode p = head;
        while (p != null){
            p = p.next;
            count ++;
        }
        if(count < k){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < k; i++) {
            p2 = p2.next;
        }
        while (p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
