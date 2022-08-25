
public class Account {
	private long id;
	private String type;
	private String name;
	private double balance;
	public double limit;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
		if(type == "SB") limit = 1000;
		else limit = 3000;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double amount) {
		balance += amount;
		System.out.println();
		System.out.println("Amount " + amount + " deposited.");
	}
	
	
	void withdrawl(double amount) {
		if(balance - amount < limit) {
			System.out.println();
			System.out.println("Transaction Declined. Please try withdrawing lesser amount.\nYou cannot withdraw the amount which results your account balance less than your account limit.");
		}
		else {
			this.balance -= amount;
			System.out.println();
			System.out.println("Amount " + amount + " withdrawled.");
		}
	}
	double balanceEnquiry() {
		return this.balance;
	}
	
}
