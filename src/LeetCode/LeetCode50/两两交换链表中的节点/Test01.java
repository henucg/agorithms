package LeetCode.LeetCode50.两两交换链表中的节点;

public class Test01 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1) ;
		ListNode l2 = new ListNode(2) ;
		ListNode l3 = new ListNode(3) ;
		ListNode l4 = new ListNode(4) ;

		l1.next = l2 ;
		l2.next = l3 ;
		l3.next = l4 ;

		swapPairs(l4) ;
	}

	public static ListNode swapPairs(ListNode head) {
		if(head==null){
			return null ;
		}

		ListNode result = null ;
		ListNode last = null ;
		while(head!=null){
			ListNode next = head.next ;

			if(next!=null){
				if(last==null){
					result = next ;
				}

				ListNode nextNext = next.next ;

				if(last!=null){
					last.next = next ;
				}

				last = head ;
				next.next = head ;
				head.next = nextNext ;

				head = nextNext ;
			}else{
				if(last==null){
					result = head ;
				}
				break ;
			}
		}

		return result ;
	}
}
