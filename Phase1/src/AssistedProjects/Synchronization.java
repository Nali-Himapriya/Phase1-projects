package AssistedProjects;

	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public synchronized void deposit(double amount) {
	        balance += amount;
	    }

	    public synchronized void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds for withdrawal");
	        }
	    }

	    public synchronized double getBalance() {
	        return balance;
	    }
	}

	public class Synchronization {
	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(2000.0);

	        Thread depositThread = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                account.deposit(100.0);
	                System.out.println("Deposited Rs100. New balance: " + account.getBalance());
	                try {
	                    Thread.sleep(100); // Simulate some work
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread withdrawThread = new Thread(() -> {
	            for (int i = 0; i < 5; i++) {
	                account.withdraw(200.0);
	                System.out.println("Withdrawn Rs200. New balance: " + account.getBalance());
	                try {
	                    Thread.sleep(100); // Simulate some work
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        depositThread.start();
	        withdrawThread.start();

	        try {
	            depositThread.join();
	            withdrawThread.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final balance: " + account.getBalance());
	    }
	}



