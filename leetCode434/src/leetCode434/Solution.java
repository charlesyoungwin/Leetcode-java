package leetCode434;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
	public int countSegments(String s) {
        int count = 0;
		String pattern = "\\b\\S+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(s);
        while(m.find()){
        	count += 1;
        	System.out.println(m.group());
        }
        return count;
    }
	
	public static void main(String[] args){
		String str = ", , , ,        a, eaefa";
		Solution solu = new Solution();
		int t = solu.countSegments(str);
		System.out.println(t);
		
	}
	
}
