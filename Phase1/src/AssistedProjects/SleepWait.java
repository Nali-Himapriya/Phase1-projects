package AssistedProjects;

public class SleepWait {
public static void main(String[] args) {
	        final Object lock = new Object();
	        Thread producer = new Thread(() -> {
	            synchronized (lock) {
	                System.out.println(" producer data producing");
	                try {
	                    Thread.sleep(1000); 
	                    lock.wait(); 
	                } catch (InterruptedException e) {
	                    System.err.println(e.getMessage());
	                }
	                System.out.println("producer resumed");
	            }
	        });

	        Thread consumer = new Thread(() -> {
	            synchronized (lock) {
	                System.out.println("Consumer is waiting for data");
	                try {
	                    Thread.sleep(2000);
	                } catch (InterruptedException e) {
	                    System.err.println(e.getMessage());
	                }
	                lock.notify(); 
	                System.out.println("Consumer has received data");
	            }
	        });

	        producer.start();
	        consumer.start();
	    }
	}



