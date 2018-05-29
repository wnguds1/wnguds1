package java_example_20180528;
//다른 패키지에 있는 a클래스 import
import java_example_20180529.A;

public class C {
public void name1() {
	//패키지가 다르고 protected 로 선언되있어서 접근 불가
	A a = new A();
	a.name="이주형";
	a.name1();
}
}
