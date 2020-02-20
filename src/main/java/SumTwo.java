import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * SumTwo
 */
public class SumTwo {
    /**
     * Time: O(n2), Space: O(1)
     * @param nums
     * @param target
     * @return
     */
    public static int[] bruteForce(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    /**
     * Time: O(n), Space: O(n)
     * @param nums
     * @param target
     * @return
     */
    public static int[] hashTable(int[] nums, int target) {
        Map<Integer, Integer> valueIndexMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            valueIndexMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer j = valueIndexMap.get(target - nums[i]);
            if(j != null && j != i) {
                return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        int[] rs = bruteForce(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(rs));
    }
}