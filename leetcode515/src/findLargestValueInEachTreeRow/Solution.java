package findLargestValueInEachTreeRow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

	
	public List<Integer> largestValues(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		if(root != null)
			queue.add(root);
		while(!queue.isEmpty()){
			int max = Integer.MIN_VALUE;
			int size = queue.size();
			for(int i = 0; i < size; i++){
				TreeNode node = queue.poll();
				max = Math.max(max, node.val);
				if(node.left != null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
			}
			result.add(max);
		}
		return result;
	}
	
	public static void main(String[] args){
		Solution solu = new Solution();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(5);
		root.right.right = new TreeNode(9);
		List<Integer> list = solu.largestValues(root);
		for(int item : list){
			System.out.print(item + " ");
		}
	}
}
