package ImplementStrStr;

public class Solution {

	public int strStr(String haystack, String needle){
		if(needle.length() > haystack.length())
			return -1;
		char[] cArr = haystack.toCharArray();
		for(int i = 0; i < cArr.length - needle.length() + 1; i++){
			int j = 0;
			int k = i;
			int count = 0;
			while(j < needle.length() && cArr[k++] == needle.toCharArray()[j++]){
				count++;
			}
			if(count == needle.length()){
				return i;
			}
			
		}
		return -1;
	}
	
	public static void main(String[] args){
		String str1 = "helloworld";
		String str2 = "or";
		System.out.println(new Solution().strStr(str1, str2));
	}
}


