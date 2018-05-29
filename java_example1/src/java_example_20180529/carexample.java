package java_example_20180529;

public class carexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//car1 클래스에대한 객체 선언
		//car1 클랫으ㅔ대한변수 crar 선언
car1 car= new car1();
Tire tire = new Tire("aaa",10);
//부모 클래스 타입의 변수 선언
hankooktire hktire = new hankooktire("한국",10);
//자식클래스 타입의 변수 선언
tire = hktire;
hktire = (hankooktire) tire;


for(int i= 1; i<=5; i++) {
	int problemlocation = car.run();

switch(problemlocation) {
case 1:
	System.out.println("앞왼쪽 hankooktire 로 교체");
	car.frontlefttire = new hankooktire("앞왼쪽",15);
	break;

case 2:
	System.out.println("앞오른쪽 kumhotire 로 교체");
	car.frontrighttire = new kumhotire("앞오른쪽",13);
	break;
case 3:
	System.out.println("뒤왼쪽 hankooktire 로 교체");
	car.backlefttire = new hankooktire("뒤왼쪽",14);
	break;
case 4:
	System.out.println("뒤오른쪽 kumhotire 로 교체");
	car.backrighttire = new kumhotire("뒤오른쪽",17);
	break;
	}
System.out.println("---------------------------------");
}
}
}