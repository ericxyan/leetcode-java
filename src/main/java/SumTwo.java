import java.util.Arrays;

/**
 * SumTwo
 */
public class SumTwo {
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] rs = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(rs));
    }
}