package LeetCode.LeetCode100.删除排序链表中的重复元素II;

import java.util.Map;
import java.util.TreeMap;

public class Test01 {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(4);
		ListNode l6 = new ListNode(5);

		l5.next = l6 ;
		l4.next = l5 ;
		l3.next = l4 ;
		l2.next = l3 ;
		l1.next = l2 ;
		head.next = l1 ;

		deleteDuplicates(head) ;
	}

	public static ListNode deleteDuplicates(ListNode head) {
		Map<Integer,Integer> map = new TreeMap<>() ;
		while(head!=null){
			Integer k = head.val ;
			if(map.get(k)==null){
				map.put(k,1) ;
			}else{
				map.put(k,map.get(k) + 1) ;
			}
			head = head.next ;
		}

		ListNode list = null ;
		ListNode result = null ;
		if(map!=null && map.size()>0){
			for(Integer entry:map.keySet()) {
				if(map.get(entry)==1) {
					ListNode l = new ListNode(entry);
					if (list == null) {
						list = l;
						result = list ;
					} else {
						list.next = l ;
						list = list.next ;
					}
				}
			}
		}

		return result ;
	}
}
