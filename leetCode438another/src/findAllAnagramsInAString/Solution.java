package findAllAnagramsInAString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

	public List<Integer> findAnagrams(String s, String p){
		List<Integer> list = new ArrayList<>();
		if(s == null || s.length() == 0 || p == null || p.length() == 0)
			return list;
		int[] chars = new int[26];
		for(char c : p.toCharArray()){
			chars[c - 'a']++;
		}
		int left = 0, right = 0, count = p.length();
		while(right < s.length()){
			if(chars[s.charAt(right) - 'a'] >= 1){
				count--;
				
			}
			chars[s.charAt(right) - 'a']--;
			right++;
			if(count == 0){
				list.add(left);
			}
			if(right - left == p.length()){
				if(chars[s.charAt(left) - 'a'] >= 0){
					count++;
				}
				chars[s.charAt(left) - 'a']++;
				left++;
			}
			
		}
		return list;
	}
	
	public static void main(String[] args){
		String s = "ababcdbaui";
		String p = "ab";
		Solution solu = new Solution();
		List<Integer> list = solu.findAnagrams(s, p);
		for(Integer item : list){
			System.out.print(item + ",  ");
		}
	}
}
