package java_example_20180525;

import java.util.Scanner;

public class studentmain {
int korean;
int english;
int math;
int[] std = new int[3];
Scanner scan= new Scanner(System.in);
Scanner scan1= new Scanner(System.in);
void grade() {
	System.out.println("학생수를 입력하시오");
	for(int stude=1; stude<std.length; stude++)
	 stude=scan.nextInt();
	System.out.println("각 학생의 국 영 수 성적을 입력하세요");
	korean=scan1.nextInt();
	english=scan1.nextInt();
	math=scan1.nextInt();
	System.out.println("1번째의 학생의 국,영,수 점수:"+korean+","+english+","+math);
	korean=scan1.nextInt();
	english=scan1.nextInt();
	math=scan1.nextInt();
	System.out.println("2번째의 학생의 국,영,수 점수:"+korean+","+english+","+math);
	korean=scan1.nextInt();
	english=scan1.nextInt();
	math=scan1.nextInt();
	System.out.println("3번째의 학생의 국,영,수 점수:"+korean+","+english+","+math);
	
	
	

	
	
	
}
}
