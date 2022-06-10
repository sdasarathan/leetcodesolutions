import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a>
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4}, 5)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = target - nums[i];
            if(numMap.containsKey(c)){
                return new int[] {numMap.get(c),i};
            }
            numMap.put(nums[i],i);
        }

        throw new IllegalArgumentException("No matching found");
    }
}
