package java_example_20180818;
import java.util.Scanner;
public class banksystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bank= new Scanner(System.in);
		Scanner give= new Scanner(System.in);
		System.out.println("------------------------");
		System.out.println("|1.예금|"+"2.출금|"+"3.잔고|"+"4.종료|");
		System.out.println("------------------------");
		
		System.out.println("선택>");
		int sum=0;
		while(true) {
			int input = bank.nextInt();
			
			
		if(input==1) {
		    System.out.println("예금액>");
				int money = give.nextInt();
		    	sum= sum + money;
			System.out.println("예금액>"+sum+"입니다.");
	
		}else if(input==2) {
			System.out.println("출금액>");
			int money = give.nextInt();
			sum = sum-money; 	
				System.out.println("현재잔액은"+sum+"입니다.");{
				if(sum<0) {
					System.out.println("잔고가 부족합니다");
				
				}
				}}else if(input==3) {
			
			System.out.println("잔고>"+sum+"원입니다.");
			
		}else {
			System.out.println("종료");
		}
		
	}
	}
}
// 1234 intnext 하고 if 1번선택시 ()입력