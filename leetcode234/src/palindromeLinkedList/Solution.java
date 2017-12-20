package palindromeLinkedList;

public class Solution {
	 public boolean isPalindrome(ListNode head) {
	         
		 ListNode fast = head, slow = head;
		 while(fast != null && fast.next != null){
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 if(fast != null){
			 slow = slow.next;
		 }
		 slow = reverse(slow);
		 fast = head;
		 
		 while(slow != null){
			 if(slow.val != fast.val)
				 return false;
			 slow = slow.next;
			 fast = fast.next;
		 }
		 return true;
			
	 }
	 
	 public ListNode reverse(ListNode head){
		 ListNode prev = null;
		 while(head != null){
			 ListNode next = head.next;
			 head.next = prev;
			 prev = head;
			 head = next;
		 }
		 return prev;
	 }
	 
	 public static void main(String[] args){
		 ListNode aNode = new ListNode(129);
		 ListNode bNode = new ListNode(321);
		 ListNode cNode = new ListNode(129);
		 aNode.next = bNode;
		 bNode.next = cNode;
		 cNode.next = null;
		 Solution solu = new Solution();
		 System.out.println(solu.isPalindrome(aNode));
	 }
}
