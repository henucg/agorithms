package ITAlgorithms.chapter01.problem02.demo01;

import java.util.Stack;

/**
 * @author cg
 * @description desc
 * @date 2020-11-02 21:41
 */
public class MyQueue {
    // 正序
    private Stack<Integer> stackIns = new Stack<>();
    // 倒序
    private Stack<Integer> stackInv = new Stack<>();

    public void add(Integer i){
        if(stackIns.empty() && stackInv.empty()) {
            stackIns.push(i);
        }else if(stackIns.empty()){
            stackInv.push(i);
            while(!stackIns.empty()){
                stackInv.push(stackIns.pop());
            }
        }else{
            stackIns.push(i);
            while(!stackInv.empty()){
                stackIns.push(stackInv.pop());
            }
        }
    }

    public Integer poll(){
        if(stackIns.empty() && stackInv.empty()){
            return null;
        }
        return stackIns.empty()?stackInv.pop():stackIns.pop();
    }

    public Integer peek(){
        if(stackInv.empty() && stackIns.empty()){
            return null;
        }
        return stackIns.empty()?stackInv.peek():stackIns.peek();
    }
}
