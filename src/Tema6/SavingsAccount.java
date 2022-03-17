package Tema6;

public class SavingsAccount extends Account {
	
	public SavingsAccount (Customer accountOwner, double balance, int accountNumber) {
		setAccountOwner(accountOwner);
		setBalance(balance);
		setAccountNumer(accountNumber);
	}
	
	@Override
	public void withdraw(int amount) throws InsuficientFundsException {
		if(amount>getBalance()) {
			throw new InsuficientFundsException("Insuficient funds for transaction");
		}else {
			int remaining;
			remaining = (int) (balance - amount);
			System.out.println("Remaining amount: " + remaining);
		}
	}
	
}
