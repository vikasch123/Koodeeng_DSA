package LinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
    if(head==null)
        return null;
    ListNode prev=null;
    ListNode cur=head;
    ListNode next=null;
    while(cur!=null){
         next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
    head=prev;


    return head;}
    public static void main(String[] args) {
        Solution solution=new Solution();
        ListNode head=solution.reverseList(null);
        System.out.println(head);

    }
}
