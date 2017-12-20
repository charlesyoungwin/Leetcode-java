package CountingBits;

public class Solution {

	public int[] countBits(int num){
		int[] result = new int[num+1];
		for(int i = 0; i <= num; i++){
			result[i] = countAndConvert(i);
		}
		return result;
	}
	
	public int countAndConvert(int num){
		int count = 0;
		while(num != 0){
			if(num % 2 == 1){
				count++;
			}
			num = num / 2;
		}
		return count;
	}
	

	public static void main(String[] args){
		Solution solu = new Solution();
		for(int item : solu.countBits(5))
			System.out.print(item + " ");
	}
}
