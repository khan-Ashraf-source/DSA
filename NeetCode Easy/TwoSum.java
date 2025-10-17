/*

Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]
Constraints:

2 <= nums.length <= 1000
-10,000,000 <= nums[i] <= 10,000,000
-10,000,000 <= target <= 10,000,000


*/


import java.util.*;
public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(target-nums[i])){
                hm.put(nums[i],i);
            }else{
                res[0]= hm.get(target-nums[i]);
                res[1]= i;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int nums[] = {3, 4, 5, 6};
        int target=7;
        System.out.println("Input: nums = "+Arrays.toString(nums)+", target = "+target);
        System.out.println("Output: "+Arrays.toString(twoSum(nums, target)));
        nums = new int[] {4, 5, 6};
        target = 10;
        System.out.println("Input: nums = "+Arrays.toString(nums)+", target = "+target);
        System.out.println("Output: "+Arrays.toString(twoSum(nums, target)));
        nums = new int[] {5,5};
        target =10;
        System.out.println("Input: nums = "+Arrays.toString(nums)+", target = "+target);
        System.out.println("Output: "+Arrays.toString(twoSum(nums, target)));
    }
}