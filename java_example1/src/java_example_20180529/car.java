package java_example_20180529;

public class car {
//필드 ,메소드,파이널 메서드
	//sports car 선언해서 car에서 선언한 메소드와 파이널 메소드를 재정의
	public int speed;
	
	public final void stop() {
		System.out.println("차를멈춤");
		speed = 0;
	}
	
	public void speedup() {
		speed += 2;
	}
}
