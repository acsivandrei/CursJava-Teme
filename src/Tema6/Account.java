package Tema6;

public class Account {
	
	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	public int getAccountNumer() {
		return accountNumber;
	}
	public void setAccountNumer(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(Customer accountOwner) {
		this.accountOwner = accountOwner;
	}
			
	public void withdraw (int amount) throws InsuficientFundsException {
		if(amount>getBalance()) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
	}
	}
}
