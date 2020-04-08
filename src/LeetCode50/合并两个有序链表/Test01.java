package LeetCode50.合并两个有序链表;

public class Test01 {
	public static void main(String[] args) {
		ListNode l11 = new ListNode(1) ;
		ListNode l12 = new ListNode(2) ;
		ListNode l13 = new ListNode(4) ;

		l12.next = l13 ;
		l11.next = l12 ;

		ListNode l21 = new ListNode(1) ;
		ListNode l22 = new ListNode(3) ;
		ListNode l23 = new ListNode(4) ;

		l22.next = l23 ;
		l21.next = l22 ;

		mergeTwoLists(l11,l21) ;
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null){
			return l2 ;
		}
		if(l2==null){
			return l1 ;
		}

		if(l1.val <= l2.val){
			l1.next = mergeTwoLists(l1.next,l2) ;
			return l1 ;
		}else{
			l2.next = mergeTwoLists(l2.next,l1) ;
			return l2 ;
		}
	}
}
