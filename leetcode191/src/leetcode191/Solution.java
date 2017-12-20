package leetcode191;

public class Solution {
	public static int hammingWeight(int n) {
		int ones = 0;
	    	while(n!=0) {
	    		ones = ones + (n & 1);
	    		n = n>>>1;
	    	}
	    	return ones;
	}
	
	public static void main(String[] args){
		int n =  2147483647;
		n = n + 1;
		System.out.println(n);
		System.out.println(Solution.hammingWeight(n));
		
		System.out.println("************************");
		n = -2147483648;
		System.out.println(n);
		
	}
}

