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
    public ListNode mergeKLists(ListNode[] lists) {
        int[] list1;
        int[] list2;
        int[] list3;

        for(int i = 0; i < lists; i++){
            if(len(list1) <= len(list2) <= len(list3)){
                while(last !- 0){
                    int i = 0, j = last;
                    while(i < j) {
                        int temp = list3[i];
                        list3[i] = list3[j];
                        list3[j] = temp;
                        i++;
                        j--;
                    }
                }
            }
            return arr[0];
            
        }
    }
}