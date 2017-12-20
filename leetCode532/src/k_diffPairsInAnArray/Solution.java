package k_diffPairsInAnArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Solution {

	public int findPairs(int[] nums, int k){
		int count = 0;
		if(nums == null || nums.length == 0 || k < 0)
			return 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums){
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(k == 0){
				if(entry.getValue() >= 2){
					count++;
				}
			}else{
				if(map.containsKey(entry.getKey() + k)){
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		int k = 1;
		System.out.println(new Solution().findPairs(nums, k));
	}

}
