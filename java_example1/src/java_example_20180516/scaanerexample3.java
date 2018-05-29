package java_example_20180516;

import java.util.Scanner;

public class scaanerexample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
int b;
System.out.println("원의 반지름을 입력하세요:");
b=a.nextInt();
double c;
System.out.println("원의면적은:"+b*b*3.14);
c=a.nextDouble();
a.close();


	}

}
