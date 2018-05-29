package java_example_20180525;

import java.util.Scanner;

public class banksystem_example {
	private static banksystem[] accountarray=new banksystem[100];
	private static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {		
	boolean run = true;
while(run) {
	System.out.println("------------------------------------");
	System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
	System.out.println("------------------------------------");
	System.out.println("선택>>");
	int num=scan.nextInt();
	
	if(num==1) {
		createAccount();
	}else if(num==2) {
		accountList();
	}else if(num==3) {
		deposit();
	}else if(num==4) {
		withdraw();
	}else if(num==5) {
		run=false;
	}
}
System.out.println("프로그램종료");
	}
	private static void createAccount() {
		System.out.println("------------------------------------");
		System.out.println("계좌ㅜ생성");
		System.out.println("------------------------------------");
		System.out.println("계좌번호:");
		String ano=scan.next();
		System.out.println("계좌주:");
		String owner=scan.next();
		System.out.println("초기입금액:");
		int balance=scan.nextInt();
	banksystem newAccount = new banksystem(ano,owner,balance);//객체 생성
	//입력받은 값을 배열변수에 넣기
	for(int i=0; i<accountarray.length; i++) {
		if(accountarray[i]==null) {
		accountarray[i]=newAccount;
		System.out.println("결과:계좌가 생성되었습니다.");
		break;
		}
		
	}
	}
	
	private static void accountList() {
		System.out.println("------------------------------------");
		System.out.println("계좌목록");
		System.out.println("------------------------------------");
		for(int i=0; i<accountarray.length; i++) {
			banksystem account = accountarray[i];
			if(account!=null) {
				System.out.println("계좌목록을 출력합니다.");
				System.out.println((i+1)+"번째 계좌");
				System.out.println("계좌번호:"+account.getAno());
				System.out.println("계좌주:"+account.getOwner());
				System.out.println("금액:"+account.getBalance());
				System.out.println("");
			}
		}
			
	}
	//입고하고자하는 계좌의 
	private static void deposit() {
		System.out.println("------------------------------------");
		System.out.println("예금");
		System.out.println("------------------------------------");
		System.out.println("계좌번호");
		String ano=scan.next();
		System.out.println("예금액");
		int balance =scan.nextInt();
		//banksystem 클래스 타ㅇ입의 account 변수를 선언
		//우변의 내용:findaccount 메소드를 호출하면서 매개변수는 ano로사용
		banksystem account=findAccount(ano);
		/*for(int i=0; i<accountarray.length; i++) {
			banksystem account = accountarray[i];
			if(account != null && ano.equals(account.getAno())) {
				account.setBalance(balance+account.getBalance());
			System.out.println("결과:예금을 성공하였습니다.");
			
		}}*/
	if ( account == null) {
		System.out.println("계좌x");
		return;
		
	}
	int balance1=account.getBalance()+balance;
	account.setBalance(balance1);
	System.out.println("예금이 성공되었습니다.");
	System.out.println("잔액은"+account.getBalance()+"입니다.");
	}
		
//
	private static void withdraw() {
	System.out.println("------------------------------------");
	System.out.println("출금");
	System.out.println("------------------------------------");
	System.out.println("계좌번호:");
	String ano=scan.next();
	System.out.println("출금액");
	int balance =scan.nextInt();
	for(int i=0; i<accountarray.length; i++) {
		banksystem account = accountarray[i];
		if(account != null && ano.equals(account.getAno())) {
			int balance1 = account.getBalance()-balance;
			account.setBalance(balance1);
			System.out.println("결과:출금이 성공되었습니다.");
		}			
	}}
	 //고객이 입력한 계좌번호오 저장되어있는 계좌번호에 대해 일치여부를 판단하는 메소드, 매개변수ano 리턴타입 banksystem 클래스
	private static banksystem findAccount(String ano)
	{
		banksystem account=null;//클래스 타입의 변수 선언(처리가 끝난 후 리턴값을 주기위해)
		//ano 일치하는 계좌번호를 찾기위해 배열의 모든 내용을 반복문을 통해 검색
		for(int i=0; i<accountarray.length; i++) {
			if(accountarray[i]!=null) {
				//배열에 저장되어있는 계좌번호를 임시로 저장하기 위한 변수
				String dbAno=accountarray[i].getAno();
				//검색된 계좌번호와 매개값으로 받은 ano 가 일치하는지판단
				if(dbAno.equals(ano)) {
					//일치하면 해당 인덱스 에 있는 내용을 account 변수에 저
					account = accountarray[i];
					break;
				}
			}
		}
		return account;
	}
	
}