package thread.生产者消费者;

import java.util.concurrent.TimeUnit;

/**
 * @author cg
 * @description desc
 * @date 2020-08-30 08:34
 */
public class Test01 {
    public static void main(String[] args) {
        final ProviderConsumer providerConsumer = new ProviderConsumer();

        // 生产者线程
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    try {
                        providerConsumer.providuce();
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        // 消费者线程
        new Thread(new Runnable() {
            public void run() {
                while(true){
                    try {
                        providerConsumer.consume();
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
