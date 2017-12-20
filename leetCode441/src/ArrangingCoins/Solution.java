package ArrangingCoins;

public class Solution {
	public static int arrangeCoins(int n) {
        int sum = 0;
        int i = 1;
        while(sum <= n){
            sum += i;
            i += 1;
        }
        return i - 2;
    }
	
	public static void main(String[] args){
		int t = arrangeCoins(1);
		System.out.println(t);
	}
}
