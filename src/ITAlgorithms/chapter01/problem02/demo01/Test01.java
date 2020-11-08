package ITAlgorithms.chapter01.problem02.demo01;

/**
 * @author cg
 * @description desc
 * @date 2020-11-02 21:51
 */
public class Test01 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        System.out.println(myQueue.peek());

        System.out.println(myQueue.poll());

        System.out.println(myQueue.peek());

        System.out.println(myQueue.poll());
    }
}
