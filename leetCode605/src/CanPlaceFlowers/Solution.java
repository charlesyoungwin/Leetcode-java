package CanPlaceFlowers;

public class Solution {

	public boolean canPlaceFlowers(int[] flowerbed, int n){
		for(int i = 0; i < flowerbed.length; i++){
			if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)){
				flowerbed[i] = 1;
				n--;
			}
		}
		return n <= 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerbed = {1, 0, 0, 0, 0, 1};
		Solution solu = new Solution();
		System.out.println(solu.canPlaceFlowers(flowerbed, 2));
		
	}

}
