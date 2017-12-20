package findAllAnagramsInAString;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<Integer> findAnagrams(String s, String p){
		char[] pArray = p.toCharArray();
		char[] sArray = s.toCharArray();
		boolean isPIntArrayAllOne = true;
		List<Integer> list = new ArrayList<Integer>();
		int[] pIntArray = new int[p.length()];
		for(int i = 0; i < p.length(); i++){
			pIntArray[i] = 0;
		}
		for(int j = 0; j < s.length() - p.length() + 1; j++){
			for(int k = 0; k < p.length(); k++){
				for(int m = 0; m < p.length(); m++){
					if(pIntArray[m] == 0 && sArray[j + k] == pArray[m]){
						pIntArray[m] = 1;
						break;
					}
				}
			}
			for(int l = 0; l < p.length(); l++){
				if(pIntArray[l] == 0){
					isPIntArrayAllOne = false;
				}
			}
			if(isPIntArrayAllOne == true){
				list.add(j);
			}
			for(int i = 0; i < p.length(); i++){
				pIntArray[i] = 0;
			}
			isPIntArrayAllOne = true;
		}
		return list;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababcdbabui";
		String p = "ab";
		Solution solu = new Solution();
		List<Integer> list = solu.findAnagrams(s, p);
		for(Integer item : list){
			System.out.print(item + ",  ");
		}
	}

}
