package addBinary;

public class Solution {

	public String addBinary(String a, String b){
		
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while(i >= 0 || j >= 0){
			int sum = carry;
			if(j >= 0) 
				sum += b.charAt(j--) - '0';
			if(i >= 0)
				sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if(carry != 0)
			sb.append(carry);
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "101";
		String b = "11";
		Solution solu = new Solution();
		System.out.println(solu.addBinary(a, b));
	}

}
