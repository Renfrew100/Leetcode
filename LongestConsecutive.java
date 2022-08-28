import java.util.*;

class Solution {
    int count = 0;
    public int longestConsecutive(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i+1] > nums[i]){
                count++;
            }
        }
    return count;
    }
}