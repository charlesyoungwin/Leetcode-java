package removeDuplicatesFromSortedArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
	
	public static int removeDuplicates(int[] nums){
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < nums.length; i++){
			if(!set.contains(nums[i])){
				set.add(nums[i]);
			}
		}
		return set.size();
	}
	
	public static void main(String[] args){
		int[] nums = { 1, 2, 1, 1, 3, 4};
		System.out.println(Solution.removeDuplicates(nums));
	}
}
