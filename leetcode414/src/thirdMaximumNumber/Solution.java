package thirdMaximumNumber;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Solution {

	public int thirdMax(int[] nums){
		HashSet<Integer> set = new HashSet<>();
		for(int item : nums){
			set.add(item);
		}
		List<Integer> list = new ArrayList<>(set);
		list.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(arg0 < arg1)
					return 1;
				else if(arg0 > arg1)
					return -1;
				else
					return 0;
			}
			
		});
		if(list.size() < 3){
			return list.get(0);
		}else{
			return list.get(2);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,1,2};
		System.out.println(new Solution().thirdMax(nums));
	}

}
