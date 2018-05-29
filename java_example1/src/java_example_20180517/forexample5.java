package java_example_20180517;

import java.util.Scanner;

public class forexample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	Scanner i= new Scanner(System.in);
	System.out.print("시작 값을 쓰세요.");
	int j = i.nextInt();
	Scanner k= new Scanner(System.in);
	System.out.println("끝값을 쓰세요");
	int h = i.nextInt();
	
	int sum = 0;
	for(int a=j; a<=h; a++) {
		sum= sum+a;
		System.out.print(a);
		if(a != h )//if(a<=(j-1)
			System.out.print("+");
		else 
System.out.println("="+sum);
		
	}
	
}
}