package removeElement;

public class Solution {
	public int removeElement(int[] nums, int val) {
        int m = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[m] = nums[i];
                m++;
            }
        }
        return m;
    }
	
	public static void main(String[] args){
		Solution solu = new Solution();
		int[] nums = {1, 2, 3, 3, 2, 5, 6};
		int m = solu.removeElement(nums, 3);
		for(int i = 0; i < nums.length; i++)
			System.out.println(nums[i]);
	}
}
