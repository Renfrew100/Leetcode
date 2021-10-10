public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 
class Solution {
    public ListNode oddEvenList(ListNode head) {
         ListNode headEven = new ListNode();
         ListNode headOdd = new ListNode();
        
        while (head.next != null) {
            headOdd.val = head.val;
            head = head.next;
            headEven.val = head.val;
            }
        
        while (headEven.next != null) {
            headOdd.next.val = headEven.val;
            headEven = headEven.next;
        }
        
        while (headOdd != null){
            System.out.println(headOdd);
            headOdd = headOdd.next;
        }
    return headOdd;
    }
    
    /*
        for(int i=0; i < head.size(); i++){
            if((head.get(i)) % 2 == 0){
              headEven.next = new ListNode(head.val, null);
            }
            if((head.get(i)) % 2 == 1){
                headOdd.next = new ListNode(head.val, null);
            }    
        } 
    */
}