package ValidPalindrome;

public class Solution {

	public boolean isPalindrome(String s){
		if(s.length() == 0)
			return true;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++){
			if(isAlphaBeta(s.charAt(i))){
				sb.append(s.charAt(i));
			}
		}
		String s1 = sb.toString().toLowerCase();
		String s2 = sb.reverse().toString().toLowerCase();
		return s1.equals(s2);
	}
	
	public boolean isAlphaBeta(char c){
		if(c >= 'a' && c <= 'z')
			return true;
		if(c >= 'A' && c <= 'Z')
			return true;
		return false;
	}
	
	public static void main(String[] args){
		String s = "A man, a plan, a canal: Panama";
		System.out.println(new Solution().isPalindrome(s));
	}
}
