package Easy;

import java.util.HashMap;

public class Contains_Duplicate_II {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(tempMap.containsKey(val) && (i + tempMap.get(val) <= k))
                return true;
            else
                tempMap.put(nums[i], i);
        }
        System.out.println(tempMap);
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 6, 9, 5, 2};
        int k = 3;
        System.out.println(containsNearbyDuplicate(arr, k));
    }
}
