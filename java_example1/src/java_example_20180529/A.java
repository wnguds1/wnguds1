package java_example_20180529;

public class A {
//A클래스는 접근제한자가 protected 필드 생성자 메소드 선언
	//b 클래스는 메소드를 선언해서 a클래스 객체만들고 a클래스의 필드 메소드에 접근가능한지 혹인
	//c 클래스는 다른 패키지에 선언 a클래스 포함시키고 a클래스는 객체만들고 a클래스의 필드,메소드 접근확인
	//d 클래스는 c클래스와 동이란 패키지선언 a클래스 포함시키고 a클래스 상속받고 생성자를 선언해서 부모클래스의 필드와 메소드에 접근 가능한지화깅ㄴ
	protected String name;
	
	protected A() {
		
	}
	protected void name1() {
		
	}
}

