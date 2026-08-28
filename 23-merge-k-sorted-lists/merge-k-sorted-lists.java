import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode n : lists) if(n!=null) pq.add(n);

        ListNode d = new ListNode(0), cur = d;

        while(!pq.isEmpty()){
            ListNode t = pq.poll();
            cur = cur.next = t;
            if(t.next!=null) pq.add(t.next);
        }

        return d.next;
    }
}