package lengthOfLastWord;

public class Solution {

	public int lengthOfLastWord(String s) {
        String[] strList = s.split(" ");
        if(strList.length == 0)
        	return 0;
        else
        	return strList[strList.length - 1].length();
    }
	
	public static void main(String[] args){
		
		Solution solu = new Solution();
		String s = "he  llo  world";
		System.out.println(s.trim().lastIndexOf(" "));
		//System.out.println(solu.lengthOfLastWord(s));
	}
}

