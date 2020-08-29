package LeetCode200.最小栈;

import java.util.Stack;

public class MinStack {
		private Stack<Integer> stack = new Stack<>() ;

		public MinStack() {

		}

		public void push(int x) {
			stack.push(x) ;
		}

		public void pop() {
			if(!stack.empty()) {
				stack.pop();
			}
		}

		public int top() {
			if(!stack.empty()) {
				return stack.pop();
			}else{
				return -1 ;
			}
		}

		public int getMin() {
			int min = Integer.MAX_VALUE ;
			if(!stack.empty()) {
				for (int i : stack) {
					if (i < min) {
						min = i;
					}
				}
			}
			return min ;
		}
}
