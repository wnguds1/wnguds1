package java_example_20180516;

import java.util.Scanner;//스캐너사용할려면 필요한 문장

public class ScannerExampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//스캐너를 사용하기 위한 스캐너 객체 생성
		Scanner scanner= new Scanner(System.in);
		String name;
		System.out.println("당신의 이름을 입력해주세요:");
		name = scanner.next();//.next()문자열 입력을 위한 스캐너 메소드 ,
		//nextInt() 정수입력
		//nextDouble()실수 입력
		//close()스캐너 종료
		System.out.println("당신의 이름은"+name+"입니다.");
		scanner.close();
	}

}
