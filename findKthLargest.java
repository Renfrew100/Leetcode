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
    public int findKthLargest(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    return nums[k-1];
}
}  