/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = FindMid(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode l = sortList(head);
        ListNode r = sortList(midNext);

        return merge(l, r);
    }

    ListNode FindMid(ListNode head){
        ListNode sl = head;
        ListNode ft = sl.next;

        while(ft != null && ft.next != null){
            sl = sl.next;
            ft = ft.next.next;
        }

        return sl;
    }

    ListNode merge(ListNode l, ListNode r){
        if(l==null) return r;
        if(r==null) return l;

        if(l.val < r.val){
            l.next = merge(l.next, r);
            return l;
        }else{
            r.next = merge(l, r.next);
            return r;
        }
    }
}