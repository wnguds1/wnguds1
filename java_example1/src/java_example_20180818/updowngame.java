package java_example_20180818;

import java.util.Scanner;

public class updowngame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan= new Scanner(System.in);
		System.out.println("1과 3사이의 값을 입력하세요");
		int updown=(int)(Math.random()*3)+1;
	    int chance = 0;
		while(true) {
			int scan1=scan.nextInt();
			chance++;
			if(scan1>updown) {
				System.out.println("더 작은수를 입력하세요.");
			}else if(scan1<updown) {
				System.out.println("더 큰수를 입력하세요");
			
			}else  {
			System.out.println("맞혔습니다. 시도횟수는:"+chance);break;}
			
		}
	}

}
