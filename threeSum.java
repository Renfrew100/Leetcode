import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;

public class threeSum{
public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<int[]> answers = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                int[] temp = {nums[i], nums[left], nums[right]};
                if (!contains(answers, temp)) {
                    answers.add(temp);
                }
                left++;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
    List<List<Integer>> ans = new ArrayList<>();
    for (int[] oldAnswer : answers) {
        ans.add(List.of(oldAnswer[0], oldAnswer[1], oldAnswer[2]));
    }
    return ans;
}

private static boolean contains(List<int[]> answers, int[] answer) {
    for (int[] oldAnswer : answers) {
        if (Arrays.equals(answer, oldAnswer)) {
            return true;
        }
    }
    return false;
}
}