package removeLinkedListElement;

public class Solution {

	 public ListNode removeElements(ListNode head, int val) {
	        ListNode tmp = head, prev = head;
	        while(tmp != null){
	            if(tmp.val == val){
	                if(tmp == head){
	                    head = tmp.next;
	                }
	                else{
	                    prev.next = tmp.next;
	                    tmp = tmp.next;
	                }
	            }else{
	            	prev = tmp;
	            	tmp = tmp.next;
	            }
	        }
	        return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = null;
		
		Solution solu = new Solution();
		head = solu.removeElements(head, 1);
		
		while(head != null){
			System.out.println(head.val);
			head = head.next;
		}
		
	}

}
