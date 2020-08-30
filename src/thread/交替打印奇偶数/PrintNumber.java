package thread.交替打印奇偶数;

public class PrintNumber implements Runnable {

	boolean flag = true ;
	Object lock = null ;

	public PrintNumber(boolean flag,Object lock){
		this.flag = flag ;
		this.lock = lock ;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i=i+2){
			synchronized (lock) {
				if (flag) {
					System.out.println(Thread.currentThread().getName() + "：" + i);
				} else {
					System.out.println(Thread.currentThread().getName() + "：" + (i+1));
				}

				lock.notifyAll();
				try {
					lock.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
