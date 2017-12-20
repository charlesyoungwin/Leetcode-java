package excelSheetColumnTitle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public String convertToTitle(int n){
		String res = "";
		while(n != 0){
			char ch = (char) ((n - 1) % 26 + 'A');
			n = (n - 1) / 26;
			res = ch + res;
		}
		return res;
	}
	
	public String convertToTitle2(int n){
		if(n == 0)
			return "";
		else
			return convertToTitle2(--n / 26) + (char) ('A' + (n % 26));
	}
	
	public static void main(String[] args){
		System.out.println(new Solution().convertToTitle2(51));
	}
}
