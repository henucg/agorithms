package LeetCode50.两数相加;

public class Test01 {

	public static void main(String[] args) {
		ListNode l11 = new ListNode(9) ;

		ListNode l21 = new ListNode(1) ;
		ListNode l22 = new ListNode(9) ;
		ListNode l23 = new ListNode(9) ;
		ListNode l24 = new ListNode(9) ;
		ListNode l25 = new ListNode(9) ;
		ListNode l26 = new ListNode(9) ;
		ListNode l27 = new ListNode(9) ;
		ListNode l28 = new ListNode(9) ;
		ListNode l29 = new ListNode(9) ;
		ListNode l210 = new ListNode(9) ;

		l29.next = l210;
		l28.next = l29;
		l27.next = l28;
		l26.next = l27;
		l25.next = l26;
		l24.next = l25;
		l23.next = l24;
		l22.next = l23;
		l21.next = l22 ;

		addTwoNumbers(l11,l21) ;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long n1 = 0 ;
		int p1 = 1 ;
		while(l1!=null){
			n1 = n1 + l1.val * p1 ;
			p1 *=10 ;
			l1 = l1.next ;
		}

		long n2 = 0 ;
		int p2 = 1 ;
		while(l2!=null){
			n2 = n2 + l2.val * p2 ;
			p2 *=10 ;
			l2 = l2.next ;
		}

		long n = n1 + n2 ;

		ListNode resultL = null;
		if(n==0) {
			resultL = new ListNode(0) ;
		}else{
			while (n != 0) {
				long a = n % 10;
				ListNode l = new ListNode(a);

				if (resultL == null) {
					resultL = l;
				} else {
					ListNode li = resultL;
					while (li != null) {
						if (li.next == null) {
							li.next = l;
							break;
						} else {
							li = li.next;
						}
					}
				}

				n = n / 10;
			}
		}

		return resultL ;
	}
}
