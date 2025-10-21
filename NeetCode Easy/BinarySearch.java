/*

You are given an array of distinct integers nums, sorted in ascending order, and an integer target.

Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1.

Your solution must run in O(logn) time.

Example 1:

Input: nums = [-1,0,2,4,6,8], target = 4

Output: 3
Example 2:

Input: nums = [-1,0,2,4,6,8], target = 3

Output: -1
Constraints:

1 <= nums.length <= 10000.
-10000 < nums[i], target < 10000
All the integers in nums are unique.

*/

public class BinarySearch{
    public static int search(int[] nums, int target){
        int len = nums.length;
        int low = 0, high = len-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {-1, 0, 2, 4, 6, 8};
        int target = 4;
        System.out.println("Target index: "+ search(nums, target));
        nums = new int[]{-2, 0, 3, 6, 9, 10};
        target = 9;
        System.out.println("Target index: "+ search(nums, target));
    }
}