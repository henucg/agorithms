package LeetCode.LeetCode150.环形链表II;

public class Test01 {
	public static void main(String[] args) {

	}

	public static ListNode detectCycle(ListNode head) {
		if(head==null || head.next==null){
			return null ;
		}

		ListNode low = head ;
		ListNode fast = head.next ;

		while(low!=fast){
			if(fast==null || fast.next==null){
				return null ;
			}

			low = low.next ;
			fast = fast.next.next ;
		}

		// low 和 fast是相遇节点
		ListNode pre1 = head ;
		ListNode pre2 = low.next ;
		while(pre1!=pre2){
			pre1 = pre1.next ;
			pre2 = pre2.next ;
		}

		return pre1 ;
	}
}
