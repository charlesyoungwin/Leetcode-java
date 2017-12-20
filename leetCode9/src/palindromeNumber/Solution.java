package palindromeNumber;

public class Solution {
	
	public boolean isPalindrome(int x){
		
		int palindromeNum = 0;
        
        while(x > 0){
            palindromeNum = palindromeNum * 10 + x % 10;
            x = x / 10;
        }
        return palindromeNum == x;
	}
	
	public static void main(String[] args){
		
		Solution solu = new Solution();
		int x = 100;
		System.out.println(solu.isPalindrome(x));
		System.out.println(x);
	}
}
