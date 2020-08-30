package LeetCode.LeetCode200.相交链表;

public class Test01 {
    public static void main(String[] args) {

    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null ;
        }

        boolean flag = false ;
        while(headA!=null){
            ListNode node = headB ;
            while(node!=null){
                if(headA.val==node.val){
                    node = node.next ;
                    break ;
                }else {
                    node = node.next;
                }
            }
            headA = headA.next ;
        }
        return null ;
    }
}
