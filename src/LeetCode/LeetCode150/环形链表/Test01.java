package LeetCode.LeetCode150.环形链表;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {

	}

	public static boolean hasCycle(ListNode head) {
		if(head==null || head.next==null){
			return false ;
		}

		Map<ListNode,Integer> map = new HashMap<>() ;
		while(head!=null){
			if(map.get(head)!=null){
				return true ;
			}else{
				map.put(head,1) ;
			}
			head = head.next ;
		}

		return false ;
	}
}
