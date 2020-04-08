package LeetCode50.删除链表的倒数第N个节点;

public class Test01 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1) ;
		ListNode l2 = new ListNode(2) ;
		ListNode l3 = new ListNode(3) ;
		ListNode l4 = new ListNode(4) ;
		ListNode l5 = new ListNode(5) ;

		l4.next = l5 ;
		l3.next = l4 ;
		l2.next = l3 ;
		l1.next = l2 ;

		ListNode head = removeNthFromEnd(l1,2) ;
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		if(head==null){
			return null ;
		}

		int length = 0 ;
		ListNode l = head ;
		while(l!=null){
			length++ ;
			l = l.next ;
		}

		if(n>length){
			return head ;
		}

		int index = length - n ;
		int i = 0 ;
		ListNode last = null ;
		ListNode first = head ;
		while(head!=null){
			if(index==i){
				if(i==0){
					if(head.next==null){
						first = null ;
					}else{
						first = head.next ;
					}
					return first ;
				}else{
					last.next = head.next ;
					return first ;
				}
			}else{
				i++ ;
				last = head ;
				head = head.next ;
			}
		}
		return first ;
	}
}
