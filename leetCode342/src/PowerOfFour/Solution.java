package PowerOfFour;

public class Solution {
	
	public boolean isPowerOfFour(int num) {
		if(num == 0)
	       return false;
	    while(num%4  == 0){
	    	num = num /4;
		 }
		 if(num != 1)
			 return false;
		 return true;
    }
	
	public static void main(String[] args){
		
		Solution solu = new Solution();
		System.out.println(solu.isPowerOfFour(5));
	}
}
