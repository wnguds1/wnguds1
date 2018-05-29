package java_example_20180517;

import java.util.Scanner;

public class forExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1부터 입력받은 수 까지의 정수 중에서 2또는 3의 배수가 아닌 총합을 계산하시오.
		Scanner scan= new Scanner(System.in);
	int sum=0; //총합 계산
	System.out.println("숫자를입력하세요");
	int num=scan.nextInt(); //입력받을 수
	for(int i=1; i<num; i++) {
		//2의배수로 판단하기위해서 :num%2 == 0 
		//3의배수로 판단하기위해서 :num%3 == 0
		if(i%2 != 0 && i%3 != 0) {
			sum = sum + i;
			
		}
	}System.out.println("합계"+sum);
	
		
	}

}
