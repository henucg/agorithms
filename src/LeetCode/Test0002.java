package LeetCode;

public class Test0002 {
	public static void main(String[] args) {
		Test0002ListNode l1 = new Test0002ListNode(9L,null) ;
		Test0002ListNode l2 =
				new Test0002ListNode(1L,
						new Test0002ListNode(9L,
								new Test0002ListNode(9L,
										new Test0002ListNode(9L,
												new Test0002ListNode(9L,
														new Test0002ListNode(9L,
																new Test0002ListNode(9L,
																		new Test0002ListNode(9L,
																				new Test0002ListNode(9L,
																						new Test0002ListNode(9L,null)))))))))) ; ;

		addTwoNumbers(l1,l2) ;
	}

	public static Test0002ListNode addTwoNumbers(Test0002ListNode l1, Test0002ListNode l2) {
		Long i1 = 0L ;
		Long hex1 = 1L ;
		while(l1!=null){
			i1 += (l1.val * hex1) ;
			l1 = l1.next ;
			hex1 *= 10 ;
		}

		Long i2 = 0L ;
		Long hex2 = 1L ;
		while(l2!=null){
			i2 += (l2.val * hex2) ;
			l2 = l2.next ;
			hex2 *= 10 ;
		}

		System.out.println(i1);
		System.out.println(i2);

		Long i = i1 + i2 ;
		if(i==0){
			return new Test0002ListNode(0L) ;
		}

		String result = i+"" ;
		Test0002ListNode resultListNode = null ;
		Test0002ListNode l = null ;

		for(int j=result.length()-1;j>=0;j--){
			Long s = Long.parseLong(String.valueOf(result.charAt(j)));
			if(j==result.length()-1){
				resultListNode = new Test0002ListNode(s) ;
				l = resultListNode ;
			}else{
				Test0002ListNode next = new Test0002ListNode(s) ;
				l.next = next ;
				l = next ;
			}
		}
		return resultListNode ;
	}
}
