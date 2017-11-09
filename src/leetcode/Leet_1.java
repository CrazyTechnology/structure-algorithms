package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ming on 2017/9/14.
 */
public class Leet_1 {

    /**
     * 方法1
     *
     * @param nums
     * @param target  时间复杂度为 O(n)
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    /**
     * 方法二  时间复杂度为O(n^2)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSums(int[] nums, int target) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(nums[i]+nums[j]==9){
                    return  new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}