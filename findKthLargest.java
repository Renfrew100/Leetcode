/*
class Solution {
    public int findKthLargest(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == k){
                System.out.println(k);
            }
        }
        return k;
    }
}
*/

//import java.util.*;

/* public class findKthLargest{
        public int findKthLarge(int[] nums, int k){
            final int N = nums.length;
            Array.sort(nums);
            return nums[N-k];
        }
} */

public class findKthLargest{
    final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : nums) {
            pq.offer(val);

            if(pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
}