package LeetCode100.删除排序链表中的重复元素II;

public class Test02 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(2) ;
		ListNode l2 = new ListNode(2) ;
		head.next = l1 ;
		l1.next = l2 ;

		deleteDuplicates(head) ;
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode last = null ;
		ListNode curr = head ;
		ListNode next = null ;

		ListNode result = null ;

		while(curr!=null){
			next = curr.next ;
			if(next!=null) {
				if (curr.val != next.val) {
					if (last == null) {
						last = curr;
						result = last;
					} else {
						last.next = curr;
						last = last.next ;
					}
					curr = next;
				} else {
					boolean flag = false ;
					while (next != null) {
						if (next.val != curr.val) {
							curr = next;
							flag = true ;
							break;
						}
						next = next.next;
					}

					if(!flag){
						if(last!=null){
							return null ;
						}else{
							last.next = null ;
						}
					}
					curr = next ;
				}
			}else{
				if(last==null){
					last = curr ;
					result = last ;
				} else {
					last.next = curr;
				}
				curr = next;
			}
		}

		return result ;
	}
}
