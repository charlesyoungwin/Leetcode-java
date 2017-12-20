package reverseLinkedList;


public class Solution {

	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
		}
	}
	public ListNode reverseListIteration(ListNode head) {
	    /* iterative solution */
	    ListNode newHead = null;
	    while (head != null) {
	        ListNode next = head.next;
	        head.next = newHead;
	        newHead = head;
	        head = next;
	    }
	    return newHead;
	}
	
	public ListNode reverseList(ListNode head) {
	    /* recursive solution */
	    return reverseListInt(head, null);
	}

	private ListNode reverseListInt(ListNode head, ListNode newHead) {
	    if (head == null)
	        return newHead;
	    ListNode next = head.next;
	    head.next = newHead;
	    return reverseListInt(next, head);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		ListNode link1 = s.new ListNode(1);
		ListNode link2 = s.new ListNode(2);
		ListNode link3 = s.new ListNode(3);
		ListNode link4 = s.new ListNode(4);
		link1.next = link2;
		link2.next = link3;
		link3.next = link4;
		link4.next = null;
		System.out.println(s.reverseListIteration(link1).next.next.val);
		
	}

}
