package LeetCode.删除排序链表中的重复元素;

public class Test02 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1) ;
		ListNode l1 = new ListNode(2) ;
		ListNode l2 = new ListNode(2) ;
		ListNode l3 = new ListNode(3) ;
		ListNode l4 = new ListNode(3) ;

		head.next = l1 ;
		l1.next = l2 ;
		l2.next = l3 ;
		l3.next = l4 ;

		deleteDuplicates(head) ;
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode curr = head ;
		while(curr!=null && curr.next!=null){
			if(curr.val==curr.next.val){
				curr.next = curr.next.next ;
			}else{
				curr = curr.next ;
			}
		}
		return head ;
	}
}
