package ContainsDuplicateII;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

	public boolean containsNearbyDuplicate(int[] nums, int k){
		Map<Integer, Integer> map = new HashMap<>();
		int temp;
		for(int i = 0; i < nums.length; i++){
			if(!map.containsKey(nums[i])){
				map.put(nums[i], i);
			}
			else{
				temp = i - map.get(nums[i]);
				if(temp <= k){
					return true;
				}
			}
		}
		return false;
	}
	
	
	public boolean containsNearbyDuplicate2(int[] nums, int k){
		
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++){
			if(i > k)
				set.remove(nums[i - k - 1]);
			if(!set.add(nums[i]))
				return true;
		}
		return false;
	}
	
	
}
