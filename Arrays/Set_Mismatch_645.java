package Arrays;

import java.util.*;

public class Set_Mismatch_645 {

    public static int[] findErrorNums(int[] nums) {

        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        int duplicate = 0;
        int missing = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (map.containsKey(i)) {

                if (map.get(i) == 2) {
                    duplicate = i;
                }

            } else {
                missing = i;
            }
        }

        result[0] = duplicate;
        result[1] = missing;

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        int[] answer = findErrorNums(nums);

        System.out.println("Duplicate = " + answer[0]);
        System.out.println("Missing = " + answer[1]);
    }
}