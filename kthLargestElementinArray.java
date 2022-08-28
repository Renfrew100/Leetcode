public class kthLargestElementinArray {
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



//[3, 2, 1, 5, 6, 4] --> k = 2
//[1, 2, 3, 4, 5, 6] --> k = 2
//[3, 2, 3, 1, 2, 4, 5, 5, 6] --> k = 4
//[1,2,2,3,3,4,5,5,6] --> k = 4