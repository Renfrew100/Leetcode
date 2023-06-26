class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return false;
   
        int l = nums.length;
        for (int i=0; i<l; i++) {
           for (int j=i+1; j<l; j++) {
               for (int k=j+1; k<l; k++) {
                   if (nums[i] == nums[j] && nums[j] == nums[k]) {
                       return true;
                   }
               }
              if (nums[i] == nums[j]) {
                 return true;
              }
           }
        }
        return false;
    }
}