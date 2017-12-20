package PascalTriangleII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	 public List<Integer> getRow(int rowIndex) {
		 	List<Integer> list = new ArrayList<Integer>();
			if (rowIndex < 0)
				return list;

			for (int i = 0; i < rowIndex + 1; i++) {
				list.add(0, 1);
				for (int j = 1; j < list.size() - 1; j++) {
					list.set(j, list.get(j) + list.get(j + 1));
				}
			}
			return list;
	  }
	 
	 public static void main(String[] args){
		 Solution solu = new Solution();
		 List<Integer> list = solu.getRow(3);
		 for(Integer i : list){
			 System.out.print(" " + String.valueOf(i));
		 }
	 }
}
