package leetcode53;

public class Solution {

	    public int maxSubArray(int[] nums) {
	        
	        return maxSubArray(nums, 0, nums.length - 1);
	    }
	    
	    public int maxSubArray(int[] nums, int low, int high){
	        
	        if(low > high)
	            return 0;
	        if(low == high)
	            return nums[low];
	            
	        int middle = low + (high - low) / 2;
	        int maxLeftArraySum, maxRightArraySum, maxMiddleArraySum;
	        int leftSum = 0;
	        int rightSum = 0;
	        int maxLeftSum = 0, maxRightSum = 0;
	        
	        maxLeftArraySum = maxSubArray(nums, low, middle);
	        maxRightArraySum = maxSubArray(nums, middle + 1, high);
	        for(int i = middle; i >= 0; i--){
	            leftSum = leftSum + nums[i];
	            if(leftSum > maxLeftSum){
	                maxLeftSum = leftSum;
	            }
	        }        
	        for(int j = middle + 1; j <= high; j++){
	            rightSum = rightSum + nums[j];
	            if(rightSum > maxRightSum){
	                maxRightSum = rightSum;
	            }
	        }
	        maxMiddleArraySum = maxLeftSum + maxRightSum;
	        return max3(maxLeftArraySum, maxRightArraySum, maxMiddleArraySum);
	    }
	    
	    public int max3(int a, int b, int c){
	        int tmp = Math.max(a, b);
	        return Math.max(tmp, c);
	    }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] nums = {1, 2};
			Solution s = new Solution();
			System.out.println(s.maxSubArray(nums));
		}

}
