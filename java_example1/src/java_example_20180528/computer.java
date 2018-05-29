package java_example_20180528;
//calculator 의 자식클래스
public class computer extends calculator{
	//부모클래스에서 선언한 area 메소드를 재정의함
	//@Override 쓰지 않아도 알아서 메소드 재정의가 된 것으로 인지하지만
	//컴파일을 정확한 지시를 위해 사용.
	@Override
double areaCircle(double r) {
	System.out.println("computer 객체의 areacircle() 실행");
	return Math.PI*r*r;
}

}
