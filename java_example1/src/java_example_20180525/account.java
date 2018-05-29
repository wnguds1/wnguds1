package java_example_20180525;

public class account {
/*private double balance;


public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	if(0<balance && balance<1000000)
		
	
		
	this.balance = balance;}*/
	public static final int min_balance = 0;
	public static final int max_balance = 1000000;
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) { 
		if(min_balance<=balance && balance<max_balance)
		{
		this.balance = balance;
		
	}else {
		return;
	}


}}
