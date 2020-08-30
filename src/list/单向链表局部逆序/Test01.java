package list.单向链表局部逆序;

/**
 * 单向链表：1->2->3->4->5->6->7->8
 * 从表头开始，每三个节点逆序，最后不足三个节点不逆序，如上链表逆序之后的结果应该是：
 * 3->2->1->6-5->4->7->8
 */
public class Test01 {
	public static void main(String[] args) {
		// 构建一个单向链表
		Node node = new Node(1,
				new Node(2,
						new Node(3,
								new Node(4,
										new Node(5,
												new Node(6,
														new Node(7,
																new Node(8,null)))))))) ;

		// 原链表输出
		Node n1 = node ;
		while(n1!=null){
			System.out.print(n1.getValue() + " -> ");
			n1 = n1.getNext();
		}

		// 每三位逆序一次
		Node nodeNew = getInvertSequence(node) ;
		// 新链表输出
		Node n2 = nodeNew ;
		while(n2!=null){
			System.out.print(n2.getValue() + " -> ");
			n2 = n2.getNext();
		}

	}

	/**
	 * 逆序
	 * @param node
	 * @return
	 */
	public static Node getInvertSequence(Node node){
		while(node!=null){
			Node first = node ;
			if(first!=null) {
				Node middle = first.getNext();
				if(middle!=null) {
					Node last = middle.getNext();
					if(last!=null) {
						// 第一个节点与第三个节点值交换位置
						int temp = last.getValue();
						last.setValue(first.getValue());
						first.setValue(temp);

						node = last.getNext();
					}
				}
			}
		}

		return node ;
	}
}
