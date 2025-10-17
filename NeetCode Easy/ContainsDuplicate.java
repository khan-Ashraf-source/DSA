/*

Contains Duplicate
Solved 
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false


*/
import java.util.*;
class ContainsDuplicate{
    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i], i);
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3 , 3};
        System.out.println("Input: nums = "+ Arrays.toString(nums));
        System.out.println("Output: "+ hasDuplicate(nums));
        nums = new int[] {1, 2, 3 , 4};
        System.out.println("Input: nums = "+ Arrays.toString(nums));
        System.out.println("Output: "+ hasDuplicate(nums));
    }
    
}