package Concurrency;

/**
 *
 * @author Imran Bijapuri
 */
public class Producer_Consumer {

    public int count = 0;
    boolean available;

    public static void main(String[] args) {
        new Producer_Consumer().init();
    }
    
    

    public void increaseCount() {
        synchronized (this) {
            if (available == true) {
                count++;
                System.out.println("count increase by producer to " + count);
            } else {
                try {
                    this.wait();
                } catch (InterruptedException ex) {}
            }
            available = false;
            this.notifyAll();
        }
    }

    public void decreaseCount() {
        synchronized (this) {
            if (available == false) {
                count--;
                System.out.println("count decreased by consumer to " + count);
            } else {
                try {
                    this.wait();
                } catch (InterruptedException ex) {}
            }
            available = true;
            this.notifyAll();
        }
    }

    public void init() {
        Producer t1 = new Producer();
        Consumer t2 = new Consumer();
        t1.start();
        t2.start();
    }

    class Producer extends Thread {
        public void run() {
            for(int i = 0; i < 100; i++){
                System.out.println("Producer thread no " + i);
                increaseCount();
            }
        }
    }

    class Consumer extends Thread {

        public void run() {
            for(int i = 0; i < 100; i++){
                System.out.println("Consumer thread no " + i);
                decreaseCount();
            }
        }
    }
}
