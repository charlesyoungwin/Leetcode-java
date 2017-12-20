package IntersectionOfTwoLinkedLists;

public class Solution {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		if(headA == null || headB == null)
			return null;
		ListNode a = headA;
		ListNode b = headB;
		while(a != b){
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;
	}
	
	public int length(ListNode node){
		int count = 0;
		while(node != null){
			count += 1;
			node = node.next;
		}
		return count;
	}
	
	public ListNode createNodeList(int[] array){
		if(array.length == 0)
			return null;
		ListNode head = new ListNode(array[0]);
		ListNode prev = head;
		if(array.length > 2){
			for(int i = 1; i < array.length; i++){
				ListNode tmp = new ListNode(array[i]);
				prev.next = tmp;
				prev = tmp;
			}
		}
		prev.next = null;
		return head;
		
	}
	
	public ListNode connectNodeList(ListNode head1, ListNode head2){
		ListNode tmp = head1, prev = head1;
		while(tmp != null){
			prev = tmp;
			tmp = tmp.next;
		}
		prev.next = head2;
		return head1;
	}
	
	public static void main(String[] args){
		Solution solu = new Solution();
		int[] arr1 = {1, 0, 5};
		int[] arr2 = {2, 9};
		int[] arrInter = {3, 4, 5, 7};
 		ListNode headA = solu.createNodeList(arr1);
		ListNode headB = solu.createNodeList(arr2);
		ListNode headInter = solu.createNodeList(arrInter);
		headA = solu.connectNodeList(headA, headInter);
		headB = solu.connectNodeList(headB, headInter);
		System.out.println(solu.getIntersectionNode(headA, headB).val);
	}
}
