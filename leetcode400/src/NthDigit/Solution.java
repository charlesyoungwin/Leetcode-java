package NthDigit;

public class Solution {

	public int findNthDigit(int n){
		int len = 1;
		long count = 9;
		int start = 1;
		
		while(n > len * count){
			n -= len * count;
			len += 1;
			count *= 10;
			start *= 10;
		}
		
		start += (n - 1) / len;
		String s = Integer.toString(start);
		return Character.getNumericValue(s.charAt((n - 1) % len));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solu = new Solution();
		System.out.println(solu.findNthDigit(12345));
	}

}
