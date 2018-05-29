package java_example_20180517;

import java.util.Scanner;

public class while_example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		int count=0, n=0;
		double sum=0;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		while(true){
			n=scanner.nextInt();
			sum=sum+n;
	if(n==0) 
		break;
		count++;
	
	}
		System.out.println("수의개수는"+count+"평균은"+sum/count);
	}

}
