package wordPattern;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	
	public static boolean wordPattern(String pattern, String str){
		
		Map<Character, String> map = new HashMap<Character, String>();
		String[] parts = str.split(" ");
		for(int i = 0; i < pattern.length(); i++){
			if(!map.containsKey(pattern.charAt(i))){
				if(!map.containsValue(parts[i]))
					map.put(pattern.charAt(i), parts[i]);	
				else{
					return false;
				}
			}
			else{
				if(!map.get(pattern.charAt(i)).equals(parts[i])){
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(Solution.wordPattern(pattern, str));
	}
}
