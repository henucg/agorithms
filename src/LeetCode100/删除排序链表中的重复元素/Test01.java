package LeetCode100.删除排序链表中的重复元素;

public class Test01 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1) ;
		ListNode l1 = new ListNode(2) ;
		//ListNode l2 = new ListNode(2) ;
		//ListNode l3 = new ListNode(3) ;
		//ListNode l4 = new ListNode(3) ;

		head.next = l1 ;
		//l1.next = l2 ;
		//l2.next = l3 ;
		//l3.next = l4 ;

		deleteDuplicates(head) ;
	}

	public static ListNode deleteDuplicates(ListNode head) {
		ListNode list = null ;
		ListNode result = null ;
		while(head!=null){
			ListNode next = head.next ;
			if(next!=null) {
				if (head.val == next.val) {
					boolean flag = false ;
					while(next!=null){
						if(next.val!=head.val){
							flag = true ;
							if(list!=null) {
								list.next = head;
							}else{
								list = head ;
								result = list ;
							}
							head = next ;
							break ;
						}
						next = next.next ;
					}

					if(!flag){
						if(list!=null) {
							head.next = null;
							list.next = head;
						}else{
							head.next = null ;
							list = head ;
							result = list ;
						}
						head = next ;
					}
				}else{
					if(list!=null) {
						list.next = head;
						list = list.next ;
					}else{
						list = head ;
						result = list ;
					}
					head = next ;
				}
			}else{
				if(list!=null) {
					list.next = head;
				}else{
					list = head ;
					result = list ;
				}
				head = next ;
			}
		}

		return result ;
	}
}
