package java_example_20180529;

public class sportscar extends car {
	//speedup 메소드 재정의
	@Override
	public void speedup() {
		speed += 10;
	}
//stop 메소드 재정의 파이널 메소드 재정의 x
	/*public fianl void stop() {
		System.out.println("차르 멈춤");
		speed += 1;
	}*/
}
