package ransomNote;

import java.util.HashMap;

public class Solution {

	public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magM = new HashMap<Character, Integer>();
        for(char c : magazine.toCharArray()){
        	int newCount = magM.getOrDefault(c, 0) + 1;
        	magM.put(c, newCount);
        }
        for(char c : ransomNote.toCharArray()){
        	int newCount = magM.getOrDefault(c, 0) - 1;
        	if (newCount < 0){
        		return false;
        	}
        	magM.put(c, newCount);
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String ransomNote = "aa";
		String magazine = "ab";
		System.out.println(s.canConstruct(ransomNote, magazine));
	}

}
