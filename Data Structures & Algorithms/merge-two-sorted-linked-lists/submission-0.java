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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        if(list1==null)
        {
            return list2;

        }
        if(list2==null)
        {
            return list1;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=list2;
        for(ListNode i=list1;i!=null;i=i.next)
        {
            for(ListNode j=list1;j!=null;j=j.next)
            {
                if(i.val<j.val)
                {
                    int t=i.val;
                    i.val=j.val;
                    j.val=t;

                }
            }
        }
        
        return list1;
    }
}