package java_example_20180517;

import java.util.Scanner;

//if , else if , else if , else
public class if_elseif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 정수를 스캔으로 입력받아서 90이상이면 점수는90~100 입니다. 등급은 A입니다.
 * 80이상 90미만이면 점수는80~90입니다. 등급은 B입니다.
 * 70이상 80미만이면 점수는70~80입니다. 등급은 C입니다.
 * 60이상 70미만이면 점수는60~70입니다. 등급은 D입니다.
 * 60미만이면 점수는60미만입니다. 재수강고고FFFFFFFFF
 */
		Scanner scan= new Scanner(System.in);
		int scan1;
		scan1= scan.nextInt();
		if(scan1<90 && scan1>=80) {
			System.out.println("점수는 90~100입니다."+"등급은 A입니다.");
		}else if(scan1<80 && scan1>=70) {
			System.out.println("점수는 80~90입니다."+"등급은 B입니다.");
		}else if(scan1<70 && scan1>=60) {
			System.out.println("점수는 70~80입니다."+"등급은 C입니다.");
		}else {
			System.out.println("점수는 60미만입니다."+"재수강고고고FFFFF");
		}
	scan.close();
	}

}
