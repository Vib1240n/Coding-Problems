import java.util.*;

class containsDuplicate {
    public static boolean Duplicate(int[] nums) {
        boolean ans = false;
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (maps.containsValue(nums[i])) {
                ans = true;
                break;
            } else {
                maps.put(i, nums[i]);
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 4, 5, 0, 3, 6 };
        boolean ans = Duplicate(arr);
        System.out.println(ans);
    }
}