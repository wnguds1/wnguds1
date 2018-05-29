package java_example_20180517;

import java.util.Scanner;

public class forexample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner i= new Scanner(System.in);
	System.out.print("더하고싶은 값을 쓰세요.");
	int j = i.nextInt();
	
	int sum = 0;
	for(int a=1; a<=j; a++) {
		sum= sum+a;
		System.out.print(a);
		if(a != j)//if(a<=(j-1)
			System.out.print("+");
		else 
System.out.println("="+sum);
		
	}
	
}
}