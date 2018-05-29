package java_example_20180529;
//자동타입 변환 예제 자식 -> 부모
//a클래스 선언
class A {
	
}
//a클래스의 자식클래스인b클래스 선언
class B extends A{
	
}

//A클래스의 자식클래스인 C클래스선언
class C extends A{
	
}
//b클래스의 자식 클래스인 d클래스선언
class D extends B{
	
}
//c클래스의 자식클래스인 e클래스선언
class E extends C{
	
}


public class promotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//b클래스 타입의 변수 b 선언
		B b = new B();
		////c클래스 타입의 변수 c 선언
		C c = new C();
		//d클래스 타입의 변수 d 선언
		D d = new D();
		//e클래스 타입의 수 e 선언
		E e = new E();
		
		//각각선언한 변수들이 자동변환 확인
		//A 클래스타입의 변수 a1 에 b를대입
		A a1 = b;
		A a2= c;
		 A a3 = d;
		 A a4= e;
		 
		  B b1 = d;
		  C C1 = e;
		 
		  
		  B b2= e;
		  C C2 = d;
		  
		  B b3=(B) a1;
 		
	}

}
