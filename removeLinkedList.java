public class removeLinkedList {
    public class ListNode {
        int val;
        int newHead;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }

/*     while(next != null){
        if(ListNode.val == val){
            removeElements(head, val);
        }
    } */
}
