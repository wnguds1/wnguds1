package java_example_20180525;

public class account_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
account acc = new account();
acc.setBalance(10000);
System.out.println("현재잔고:"+acc.getBalance());
acc.setBalance(-100);
System.out.println("현재잔고:"+acc.getBalance());
acc.setBalance(2000000);
System.out.println("현재잔고:"+acc.getBalance());
acc.setBalance(300000);
System.out.println("현재잔고:"+acc.getBalance());
	}

}
