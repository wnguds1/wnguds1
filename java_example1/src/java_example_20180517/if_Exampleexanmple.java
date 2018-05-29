package java_example_20180517;

import java.util.Scanner;

public class if_Exampleexanmple {

	public static void main(String[] args) {
		Scanner grade= new Scanner(System.in);
		System.out.println("점수를입력하세요.");
		int grade1=grade.nextInt();
		Scanner human = new Scanner(System.in);
		System.out.println("학년을입력하세요.");
		int human1=grade.nextInt();
		if (grade1>=60) {
			if(human1 !=4)
				System.out.println("합격입니다.");
			else if(grade1>=70 && human1==4)
				System.out.println("합격입니다.");
			else
				System.out.println("불합격입니다.");
		}else
			System.out.println("불합격입니다.");
		grade.close();
		human.close();
	}

}

