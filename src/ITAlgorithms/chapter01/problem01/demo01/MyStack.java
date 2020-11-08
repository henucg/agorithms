package ITAlgorithms.chapter01.problem01.demo01;

import java.util.Stack;

/**
 * @author cg
 * @description desc
 * @date 2020-11-01 21:07
 */
public class MyStack {

    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> dataStack = new Stack<>();

    public void push(Integer i){
        if(minStack.empty() || i<minStack.peek()){
            minStack.push(i);
        }
        dataStack.push(i);
    }

    public Integer pop(){
        if(dataStack.empty()){
            return null;
        }
        if(!minStack.empty() && dataStack.peek() == minStack.peek()){
            minStack.pop();
        }
        return dataStack.pop();
    }

    public Integer getMin(){
        if(minStack.empty()){
            return null;
        }
        return minStack.peek();
    }
}
