package java_example_20180523;

public class car_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//car 클래스 객체선언
		//car 클래스에서 선언하 필드값 출력
		car mycar=new car();//my car 객체생성
		System.out.println("car클래시의 company 필드값:"+mycar.company);//필드값출력
		System.out.println("car클래시의 model 필드값:"+mycar.model);
		System.out.println("car클래시의 color 필드값:"+mycar.color);
		System.out.println("car클래시의 maxspeed 필드값:"+mycar.maxspeed);
		System.out.println("car클래시의  speed:"+mycar.speed);
	//필드값 변경
		mycar.speed=60;
		System.out.println("car클래시의  speed:"+mycar.speed);
	}
	

}
