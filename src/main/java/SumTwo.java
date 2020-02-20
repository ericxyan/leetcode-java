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
        Map<Integer, Integer> valueIndexMap = new HashMap<>();
        Integer j = null;
        for (int i = 0; i < nums.length; i++) {
            j = valueIndexMap.get(target - nums[i]);
            if(j != null && j != i) {
                return new int[] {i, j};
            }
            valueIndexMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(hashTable(new int[]{3, 7, 3, 15}, 6))); // expect [0, 2]
        System.out.println(Arrays.toString(hashTable(new int[]{3, 3}, 6))); // expect [0, 1]
    }

}
