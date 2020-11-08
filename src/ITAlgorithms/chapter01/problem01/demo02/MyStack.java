package ITAlgorithms.chapter01.problem01.demo02;

import java.util.Stack;

/**
 * @author cg
 * @description desc
 * @date 2020-11-02 21:11
 */
public class MyStack {

    private Stack<Integer> minStack = new Stack<>();
    private Stack<Integer> dataStack = new Stack<>();

    public void push(Integer i){
        dataStack.push(i);
        if(minStack.empty() || minStack.peek()>i){
            minStack.push(i);
        }else{
            minStack.push(minStack.peek());
        }
    }

    public Integer pop(){
        if(dataStack.empty()){
            return null;
        }
        minStack.pop();
        return dataStack.pop();
    }

    public Integer getMin(){
        if(minStack.empty()){
            return null;
        }
        return minStack.peek();
    }
}
