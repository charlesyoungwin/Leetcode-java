package findAllDuplicatesInAnArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	
	public List<Integer> findDuplicates(int[] nums){
		
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int item : nums){
			map.put(item, map.getOrDefault(item, 0) + 1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() == 2){
				list.add(entry.getKey());
			}
		}
		return list;
	}
	
	public List<Integer> findDuplicates2(int[] nums){
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < nums.length; i++){
			int location = Math.abs(nums[i]) - 1;
			if(nums[location] < 0){
				list.add(Math.abs(nums[location]));
			}
			else{
				nums[location] = -nums[location];
			}
		}
		return list;
		
	}
	public static void main(String[] args){
		int[] input = {4, 3, 2, 7, 8, 2, 3, 1};
		Solution solu = new Solution();
		List<Integer> list = solu.findDuplicates2(input);
		for(int item : list){
			System.out.print(item + "  ");
		}
	}
}
