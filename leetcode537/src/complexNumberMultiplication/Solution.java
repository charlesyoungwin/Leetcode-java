package complexNumberMultiplication;

public class Solution {

	public String complexNumberMultiply(String a, String b){
		
		String[] aStr = a.split("\\+");
		String[] bStr = b.split("\\+");
		aStr[1] = aStr[1].substring(0, aStr[1].length() - 1);
		bStr[1] = bStr[1].substring(0, bStr[1].length() - 1);
		int realPart = Integer.valueOf(aStr[0]) * Integer.valueOf(bStr[0])
				- Integer.valueOf(aStr[1]) * Integer.valueOf(bStr[1]);
		int imagePart = Integer.valueOf(aStr[0]) * Integer.valueOf(bStr[1])
				+ Integer.valueOf(aStr[1]) * Integer.valueOf(bStr[0]);
		return realPart + "+" + imagePart + "i";
		
	}
	
	public static void main(String[] args){
		
		String a = "1+-1i";
		String b = "1+-1i";
		System.out.println(new Solution().complexNumberMultiply(a, b));
		
	}
}
