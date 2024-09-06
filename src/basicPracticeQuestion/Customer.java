package basicPracticeQuestion;

class ATM{
	
	
	 public ATM() {
		
	}
	 synchronized  public void checkBal(String name) {
		 System.out.println(name+"is checking Balance");
		 }
	 synchronized  public void withdraw(String name, double amount) {
		 System.out.println(name+"is withdraw"+amount);
	 }
}

public class Customer extends Thread {
     ATM atm;
	


	public Customer(ATM atm, String name, int amount) {
		super();
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}


	public String name;
	public int amount;
	
	public void useATM() {
		atm.checkBal(name);
		atm.withdraw(name, amount);
		
		
	}
	public void run() {
		useATM();
	}
	

	public static void main(String[] args) {
		ATM at1=new ATM();
		Customer c1 = new Customer(at1,"Praveen",100);
		
		Customer c2= new Customer(at1,"Priya",1000);
		c1.start();
		c2.start();
	}

}
