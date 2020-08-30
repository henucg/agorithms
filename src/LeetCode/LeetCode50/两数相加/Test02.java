package LeetCode.LeetCode50.两数相加;

public class Test02 {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2) ;
		ListNode l2 = new ListNode(4) ;
		ListNode l3 = new ListNode(3) ;

		ListNode l4 = new ListNode(5) ;
		ListNode l5 = new ListNode(6) ;
		ListNode l6 = new ListNode(4) ;

		l1.next = l2 ;
		l2.next = l3 ;

		l4.next = l5 ;
		l5.next = l6 ;

		addTwoNumbers(l1,l4) ;
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		long i1 = 0 ;
		long p = 1 ;
		while(l1!=null){
			i1 = i1 + l1.val * p ;
			p = p * 10 ;
			l1 = l1.next ;
		}

		long i2 = 0 ;
		long k = 1 ;
		while(l2!=null){
			i2 = i2 + l2.val * k ;
			k = k * 10 ;
			l2 = l2.next ;
		}

		long sum = i1 + i2 ;
		ListNode root = null ;
		ListNode next = null ;
		while(sum>0){
			long m = sum%10 ;
			long n = sum/10 ;

			if(root==null){
				root = new ListNode(m) ;
				next = root ;
			}else{
				next.next = new ListNode(m) ;
				next = next.next ;
			}
			sum = n ;
		}
		return root ;
	}
}
