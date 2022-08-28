class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}