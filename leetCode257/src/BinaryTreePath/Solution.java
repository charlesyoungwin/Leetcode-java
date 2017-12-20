package BinaryTreePath;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<String> binaryTreePaths(TreeNode root){
		List<String> alist = new ArrayList<String>();
		if(root != null)
			visit(root, "", alist);
		return alist;
	}
	
	public void visit(TreeNode root, String path, List<String> alist){
		if(root.left == null && root.right == null){
			alist.add(path + root.val);
		}
		if(root.left != null)
			visit(root.left, path + root.val + "->", alist);
		if(root.right != null)
			visit(root.right, path + root.val + "->", alist);
		
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
		List<String> result = solu.binaryTreePaths(root);
		
		for(String str : result){
			System.out.print(str + "  ");
		}
	}
	

}
