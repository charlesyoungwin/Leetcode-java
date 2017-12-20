package battleshipsInBoard;

public class Solution {

	public int countBattleships(char[][] boards){
		int count = 0;
		for(int i = 0; i < boards.length; i++){
			for(int j = 0; j < boards[0].length; j++){
				if(boards[i][j] == 'x' && (i == 0 || boards[i - 1][j] == '.') && (j == 0 || boards[i][j - 1] 
						== '.')){
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args){
		
	}
}
