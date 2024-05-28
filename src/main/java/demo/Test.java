package demo;

public class Test {

	public static void main(String[] args) {
		
		Object lock1 = new Object();
		Object lock2 = new Object();
		
		new Thread(()->{
			synchronized (lock1) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("I am in threat1");
				}
			}
		}).start();
		
		new Thread(()->{
			synchronized (lock2) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("I am in threat2");
				}
			}
		}).start();
		
	}

}
