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
    public ListNode removeNodes(ListNode head) {
     ListNode nn=new ListNode(0);
     nn.next=head;
    
    ListNode dummy=nn;
    ListNode temp=new ListNode();
    temp=head;

    while(temp!=null && temp.next!=null){
        if(temp.val<temp.next.val){
            dummy.next=temp;
            dummy=temp;

        }  
        temp=temp.next; 
    }
    return nn.next;
    }
}