package java_example_20180523;

public class calculator_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//caculator 객체 생성
		//poweron 메소드 호출
		//plus 메소트 호출 및 결과
		//divide 메소드 호출 및 결과
		//poweroff 메소드출력
		
		calculator c1 = new calculator();
		int result = c1.plus(10, 20);
	    c1.Poweron();
		System.out.println(result);
		double result1 = c1.divide(10,20);
		System.out.println(result1);
		c1.Poweroff();
	

}
}