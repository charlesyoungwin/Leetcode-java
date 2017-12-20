package ShortestUnsortedContinuousSubarray;

import java.util.Arrays;

public class Solution {

	public int findUnsortedSubarray(int[] nums){
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] sortedNums = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			sortedNums[i] = nums[i];
		}
		Arrays.sort(sortedNums);
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != sortedNums[i]){
				if(i < min){
					min = i;
				}
				if(i > max){
					max = i;
				}
			}
		}
		if(max == Integer.MIN_VALUE || min == Integer.MAX_VALUE){
			return 0;
		}else		
			return max - min + 1;
	}
	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		Solution solu = new Solution();
		System.out.println(solu.findUnsortedSubarray(nums));
	}
}
