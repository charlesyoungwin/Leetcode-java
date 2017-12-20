package IsomorphicStrings;

import java.util.HashMap;

public class Solution {

	 public boolean isIsomorphic(String s, String t) {
		 if(s == null || s.length() <= 1)
			 return true;
		 HashMap<Character, Character> map = new HashMap<Character, Character>();
		 for(int i = 0; i < s.length(); i++){
			 char a = s.charAt(i);
			 char b = t.charAt(i);
			 if(map.containsKey(a)){
				if(b != map.get(a))
					return false;
				continue;
			 } else{
				 if(map.containsValue(b)){
					 return false;
				 }
				 map.put(a, b);
			 }
		 }
		 return true;
	 }
	 
	 public static void main(String[] args){
		 String s = "ab";
		 String t = "aa";
		 Solution solu = new Solution();
		 System.out.println(solu.isIsomorphic(s, t));
	 }
	 
}
