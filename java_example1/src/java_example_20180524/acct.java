package java_example_20180524;

public class acct {
	private String Ownername;
	private int AccountNumber;
	private int Balance;
private int deposit;
private int withdraw;
void deposit(int deposit) {
	this.deposit=deposit;
}
void withdraw(int withdraw) {
	this.withdraw=withdraw;
}
public String getOwnername() {
	return Ownername;
}
public int getAccountNumber() {
	return AccountNumber;
}
public int getBalance() {
	return Balance;
}

public void setName(String Ownername) {
	this.Ownername = Ownername;
}
public void setAccountNumber(int accountNumber) {
	AccountNumber = accountNumber;
}
public void setBalance(int balance) {
	Balance = balance;
}

void result(){
	System.out.println("예금주 이름:"+getOwnername());
	System.out.println("계좌번호:"+getAccountNumber());
	int sum=(getBalance()+deposit)-withdraw;
	System.out.println("잔고:"+sum);
}


}
