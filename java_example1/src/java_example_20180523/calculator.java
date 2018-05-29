package java_example_20180523;
//method 연습예제 페이지217
public class calculator {
//method선언 메소드이름 Poweron 메소드 타입:void
	void Poweron() {
		System.out.println("전원을 켭니다.");
	}
	int plus(int x, int y) {
		int result=x+y;
		return result;//리턴해주는 변수타입과 선언타입이같아야함
	}
	double divide(int x, int y) {
		double result=(double)x/(double)y;
		return result;
	}
	void Poweroff() {
		System.out.println("전원을 끕니다.");
	}
}
