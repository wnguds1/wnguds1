package java_example_20180523;

public class car2_example {

	public static void main(String[] args) {
	//1. 기본 생성자를 이용한 객체 생성하영 필드값ㅊㄹ출역
	//2. model 매개변수 갖는 생성자를 이용한 객체 생성하영 필드값 출력
		//3. model,color 매개변수 갖는 생성자를 이용한 객체 생성하영 필드값 출력
		//4. model,.color,maxspeed 매개변수 갖는 생성자를 이용한 객체 생성하영 필드값 출력
car2 c1 = new car2();
System.out.println(c1.company);
System.out.println(c1.model);
System.out.println(c1.color);
System.out.println(c1.maxspeed);

car2 c2 = new car2("자동차");
System.out.println(c2.company);
System.out.println(c2.model);
System.out.println(c2.color);
System.out.println(c2.maxspeed);

car2 c3 = new car2("자동차","검정");
System.out.println(c3.company);
System.out.println(c3.model);
System.out.println(c3.color);
System.out.println(c3.maxspeed);

car2 c4 = new car2("자동차","검정",300);
System.out.println(c4.company);
System.out.println(c4.model);
System.out.println(c4.color);
System.out.println(c4.maxspeed);

	}

}
