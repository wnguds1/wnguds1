package java_example_20180525;

import java.util.Scanner;

public class distance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		while (true) {
			distance math = new distance();{
				System.out.println("-------------------");
				System.out.println("수정할 내용을 선택하세요.");
				System.out.println("1.두점 사이의 거리 구하기");
				System.out.println("2.절대값 구하기");
				System.out.println("선택>>");
				int choice = scan.nextInt();
				switch(choice){
				case 1:
					System.out.println("두 점을 (x,y) 순으로 입력하세요");
					math.x=scan1.nextInt();
					math.y=scan1.nextInt();
					math.x1=scan1.nextInt();
					math.y1=scan1.nextInt();
					System.out.println("첫번째 x좌표"+math.x);
					System.out.println("첫번째 y좌표"+math.y);
					System.out.println("첫번째 x좌표"+math.x1);
					System.out.println("첫번째 y좌표"+math.y1);
					math.result();
					break;
				case 2:
					System.out.println("정수를 입력해주세요");
					math.num=scan1.nextInt();
					System.out.println("정수:"+math.num);
					math.result1();
					
				}
				
			}
		
	}

}}
