package BalancedBinaryTree;

import java.util.ArrayList;
import java.util.List;

import BalancedBinaryTree.Solution;
import BalancedBinaryTree.TreeNode;

public class Solution {

	public boolean isBalanced(TreeNode root) {
		if(root == null)
        	return true;
		int left = depth(root.left);
		int right = depth(root.right);
		
		return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right); 
        
    }
	
	public int depth(TreeNode root){
		if(root == null)
			return 0;
		return Math.max(depth(root.left), depth(root.right)) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		for(int i = 0; i < 9; i++){
			TreeNode node = new TreeNode(i  + 1);
			nodeList.add(node);
		}
		nodeList.get(0).left = nodeList.get(1);
		nodeList.get(0).right = nodeList.get(2);
		nodeList.get(1).left = nodeList.get(3);
		nodeList.get(1).right = nodeList.get(4);
		nodeList.get(3).left = nodeList.get(7);
		nodeList.get(3).right = nodeList.get(8);
		nodeList.get(2).left = nodeList.get(5);
		nodeList.get(2).right = nodeList.get(6);
		
		TreeNode root = nodeList.get(0);
		Solution solu = new Solution();
		
		System.out.println(solu.isBalanced(root));
		
	}

}
