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
    public ListNode mergeNodes(ListNode head) {
        ListNode newHead = new ListNode(0);
        ListNode tmp=newHead;
        head=head.next;
        int sum=0;
        while(head!=null){
            if(head.val == 0){
                tmp.next=new ListNode(sum); //4,11
                tmp=tmp.next;
                sum = 0;
            }else{
                sum+=head.val;
            }
            head = head.next;
        }
        return newHead.next;
        
    }
}