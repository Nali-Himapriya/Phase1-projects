package AssistedProjects;

class MyThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread extended: " + i);
     }
 }
}

class MyRunnable implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread implemented: " + i);
     }
 }
}

public class ThreadExample {
 public static void main(String[] args) {
     MyThread thread1 = new MyThread(); 
     Thread thread2 = new Thread(new MyRunnable()); 

     thread1.start();
     thread2.start();
 }
}
