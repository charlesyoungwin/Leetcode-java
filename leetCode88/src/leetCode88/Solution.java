package leetCode88;

public class Solution {

	 public void merge(int[] nums1, int m, int[] nums2, int n) {
	        int i = m - 1;
	        int j = n - 1;
	        int k = m + n - 1;
	        while(i >= 0 && j >= 0){
	        	if(nums1[i] > nums2[j]){
	        		nums1[k--] = nums1[i--];
	        	}
	        	else
	        		nums1[k--] = nums2[j--];
	        }
	        while(j >= 0)
	        	nums1[k--] = nums2[j--];
	        
	    }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {2,0};
		int[] nums2 = {1};
		Solution solu = new Solution();
		solu.merge(nums1, 1, nums2, 1);
		for(Integer item : nums1){
			System.out.println(item);
		}
	}

}
