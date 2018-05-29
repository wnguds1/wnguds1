package java_example_20180521;

import java.util.Scanner;

public class arrayexample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 거스름돈 문제
 * 어떤 금액을 입력하게- 되면 각 동전이 몇개씩 필요한지 출력하는 문제
 * 가능한 적은수의 동전으로 거슬러 줄 수 있도록
 */
		Scanner scan= new Scanner(System.in);
int[] coinunit = {500,100,50,10};
System.out.println("금액을입력하세요");
int change=scan.nextInt();
for(int i=0; i<coinunit.length; i++) {
	int count=change/coinunit[i];
	System.out.println(coinunit[i]+"원 동전"+count+"개");
	change=change%coinunit[i];
}

	
		
	}
	}


