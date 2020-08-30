package thread.生产者消费者;

/**
 * @author cg
 * @description desc
 * @date 2020-08-30 08:26
 */
public class ProviderConsumer {

    // 对象锁
    private Object lock = new Object() ;
    // 商品总数
    private int count = 0 ;
    // 是否生产了商品
    private volatile boolean isProduced = false ;

    // 生产者
    public void providuce() throws InterruptedException {
        synchronized (lock){
            if(isProduced){
                lock.wait();
            }else{
                System.out.println("生产商品："+(count++));
                // 唤醒消费者
                lock.notify();
                isProduced = true ;
            }
        }
    }

    // 消费者
    public void consume() throws InterruptedException {
        synchronized (lock){
            if(isProduced){
                System.out.println("消耗商品："+(count--));
                lock.notify();
                isProduced = false ;
            }else{
                lock.wait();
            }
        }
    }
}
