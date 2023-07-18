import java.util.Arrays;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j <= n; j++) {
                nums1[i] = nums2[j];
                i++;
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
    }
    public static void main(String[] args){
        MergeSortedArray msa = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,9,8,9};
        int[] nums2 = {2,5,6,5,9,9,0}; 
        msa.merge(nums1,5,nums2,5);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }
}

r