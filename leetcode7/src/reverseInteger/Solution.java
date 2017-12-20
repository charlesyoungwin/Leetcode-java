package reverseInteger;

public class Solution {

	public int reverse(int x){
		int result = 0;
		while(x != 0){
			int tail = x % 10;
			int newResult = result * 10 + tail;
			if((newResult - tail) / 10 != result){
				return 0;
			}
			result = newResult;
			x = x / 10;
		}
		return result;
	}
	
	public int reverse2(int x){
		long result = 0;
		while(x != 0){
			int tail = x % 10;
			result = result * 10 + tail;
			if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
				return 0;
			}
			x = x / 10;
		}
		return (int)result;
	}
	
	public static void main(String[] args){
		Solution solu = new Solution();
		int x  =  153423649;
		System.out.println(solu.reverse2(x));
	}
}
