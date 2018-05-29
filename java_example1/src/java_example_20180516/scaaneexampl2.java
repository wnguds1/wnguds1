package java_example_20180516;

import java.util.Scanner;

public class scaaneexampl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a= new Scanner(System.in);
String b;
String c;
int d;
double e;
System.out.println("이름,도시,나이,체중을 빈칸으로 분리하여 입력하세요:");
b= a.next();
c= a.next();
d=a.nextInt();
e= a.nextDouble();
System.out.println("당신의 이름은:"+b+"입니다.");
System.out.println("당신의 사는도시는:"+c+"입니다.");
System.out.println("당신의 나이는:"+d+"입니다.");
System.out.println("당신의 체중인:"+e+"입니다.");
a.close();
	}

}
