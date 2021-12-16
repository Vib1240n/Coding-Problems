import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 2) {
            if (nums[i] + nums[i + 1] == target) {
                ans[i] = nums[i];
                ans[i + 1] = nums[i + 1];
            }
        } else {
            for (i = 0; i < nums.length; i++) {
                if (nums[i] < target) {
                    map.put(i, nums[i]);
                }
            }
            for (int s : map.values()) {

            }

        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
