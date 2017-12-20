package leetCode167;

import java.util.HashMap;

public class twoSum {
	
	public int[] twoSum(int[] numbers, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] ret = new int[2];
		for(int i = 0; i < numbers.length; i++){
			if (map.containsKey(target - numbers[i])){
				ret[0] = map.get(target - numbers[i]) + 1;
				ret[1] = i + 1;
				break;
			}
			map.put(numbers[i], i);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoSum atwoSum = new twoSum();
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		int[] result = atwoSum.twoSum(numbers, target);
		for(int i : result){
			System.out.print(i + " ");
		}
	}

}
