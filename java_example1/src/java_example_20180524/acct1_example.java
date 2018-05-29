package java_example_20180524;

public class acct1_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
acct acct1 = new acct();
acct1.setName("홍길동");
acct1.setAccountNumber(101);
acct1.setBalance(10000);
acct1.deposit(3000);
acct1.withdraw(5000);
acct1.result();


	}

}
