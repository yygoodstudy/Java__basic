package com.yy.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @date 2023/4/6
 */
public class Solution {
    /**
     * 方法1：暴力破解法
     */
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                for (int j = 1; j < length; j++) {
                    int sum = nums[i] + nums[j];
                    if (target == sum && i != j) {
                        int[] array = new int[2];
                        array[0] = i;
                        array[1] = j;
                        return array;
                    }
                }
            }
        }
        return new int[2];
    }

    /**
        方法2：推荐
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        for 1 ： map--><2:2>
        for 2:   map--><2:0,5:1>
        for 3:  map--><2:0,5:1,>
     */
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] ints = solution.twoSum(nums, target);
        Arrays.stream(ints).forEach(System.out::println);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 0);
        map.put(5, 1); // int temp = 10-5 = 5;
        map.put(5, 2);

    }
}
