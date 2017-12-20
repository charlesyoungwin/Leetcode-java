package leetcode189;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public void rotate(int[] nums, int k){
		
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	
	void reverse(int[] nums, int start, int end){
		
		while(start < end){
			int temp = nums[end];
			nums[end] = nums[start];
			nums[start] = temp;
			start += 1;
			end -= 1;
		}
		
	}
}
