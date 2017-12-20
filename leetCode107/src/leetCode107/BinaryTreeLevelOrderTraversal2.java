package leetCode107;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal2 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		
		List<List<Integer>> wraplist = new LinkedList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		if (root == null)
			return wraplist;
		queue.offer(root);
		while(!queue.isEmpty()){
			int queueSize = queue.size();
			List<Integer> tmpList = new LinkedList<Integer>();
			for(int i = 0; i < queueSize; i++){
				if(queue.peek().left != null)
					queue.offer(queue.peek().left);
				if(queue.peek().right != null)
					queue.offer(queue.peek().right);
				tmpList.add(queue.poll().val);
			}
			wraplist.add(0, tmpList);
		}
		return wraplist;
		
		
	}
}
