package LeetCode.LeetCode150.环形链表;

public class Test02 {
	public static void main(String[] args) {

	}

	public static boolean hasCycle(ListNode head) {
		if(head==null || head.next==null){
			return false ;
		}

		ListNode low = head ;
		ListNode fast = head.next ;
		while(low!=fast){
			if(low==null && fast==null){
				return false ;
			}

			low = low.next ;
			fast = fast.next.next ;
		}

		return true ;
	}
}
