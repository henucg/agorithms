package ITAlgorithms.chapter01.problem03.demo01;

import java.util.Stack;

/**
 * @author cg
 * @description desc
 * @date 2020-11-02 22:13
 */
public class Test01 {
    public static void main(String[] args) {

    }

    public Integer reverseStack(Stack<Integer> stack){
        Integer i = stack.pop();
        if(stack.empty()){
            return i;
        }else{

            return reverseStack(stack);
        }
    }
}
