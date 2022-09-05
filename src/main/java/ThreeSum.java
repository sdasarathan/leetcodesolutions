import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int[] nums = new int[]{1, 2, 3, -5, 10};
        Arrays.sort(nums);

        for (int i = 0; i <= nums.length-1; i++) {
            if(i == 0 || nums[i-1] != nums[i]) {
                threeSum(i, nums, result);
            }
        }
        for (List<Integer> integers : result) {
            System.out.println(integers.get(0)+":"+integers.get(1)+":"+integers.get(2));
        }

    }

    static void threeSum(int i, int[] nums, List<List<Integer>> result){
        int low = i+1;
        int high = nums.length-1;
        while(low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            if (sum > 0) {
                high--;
            }else if(sum < 0){
                low++;
            }else{
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[low]);
                list.add(nums[high]);
                result.add(list);
                low++;
                high--;
                //Avoid duplicate
                while (low < high) {
                    if(nums[low] == nums[low+1]) {
                        low++;
                    }
                }
            }
        }
    }
}
