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
        if(head==null){
            return head;
        }
    ListNode prev=null;
    ListNode next=null;
    ListNode temp=head;
    while(temp!=null){
        next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;
    }
    head=prev;

    int max=head.val;

    temp=head;
    while(temp.next!=null){

            if(temp.next.val<max){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
                max=temp.val;
            }
            
    }
    prev=null;
    next=null;
    temp=head;
    while(temp!=null){
        next=temp.next;
        temp.next=prev;
        prev=temp;
        temp=next;
    }
    return prev;
    }
}