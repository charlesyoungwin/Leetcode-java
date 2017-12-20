package LongestCommonPrefix;

public class Solution {

	public String longestCommonPrefix(String[] strs){
		 if (strs.length == 0) 
			 return "";
		    String pre = strs[0];
		    for (int i = 1; i < strs.length; i++)
		        while(strs[i].indexOf(pre) != 0)
		            pre = pre.substring(0,pre.length()-1);
		 return pre;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"aa", "a", "asdf"};
		Solution solu = new Solution();
		System.out.println(solu.longestCommonPrefix(strs));
	}

}
