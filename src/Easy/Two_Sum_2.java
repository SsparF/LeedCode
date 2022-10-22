package Easy;

public class Two_Sum_2 {
    /* Given an array of integers nums and an integer target, return indices of the two numbers such
    that they add up to target. You may assume that each input would have exactly one solution, and
    you may not use the same element twice. You can return the answer in any order. */
    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(twoSum(nums, target));
    }
}