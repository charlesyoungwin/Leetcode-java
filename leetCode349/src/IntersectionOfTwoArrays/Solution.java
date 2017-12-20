package IntersectionOfTwoArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public int[] intersection(int[] nums1, int[] nums2){
		Set<Integer> set = new HashSet<>();
		Set<Integer> intersect = new HashSet<>();
		for (int i = 0; i < nums1.length; i++){
			set.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i++){
			if(set.contains(nums2[i])){
				intersect.add(nums2[i]);
			}
		}
		int[] result = new int[intersect.size()];
		int i = 0;
		for (Integer num : intersect){
			result[i++] = num;
		}
		return result;
	}
	
	
	public int[] intersection2(int[] nums1, int[] nums2){
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums2);
		for(Integer i : nums1){
			if(binarySearch(nums2, i)){
				set.add(i);
			}
		}
		int[] result = new int[set.size()];
		int i = 0;
		for (Integer num : set){
			result[i++] = num;
		}
		return result;
		
	}
	
	private boolean binarySearch(int[] nums, int target){
		int low = 0;
		int high = nums.length - 1;
		while(low <= high){
			int mid = low + (high - low) / 2;
			if(nums[mid] == target)
				return true;
			else if(nums[mid] > target){
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		Solution s = new Solution();
		int[] result = s.intersection2(nums1, nums2);
		for (int i : result)
			System.out.println(i);
	}

}
