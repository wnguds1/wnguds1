package java_example_20180523;

public class car3_example {

	public static void main(String[] args) {

car3 car = new car3();
//setgas 호출하고 매개변수값 5
car.setGas(5);
//isleftgas 메소드 호출결과를 gasState변수에 넣기
boolean gasState= car.isleftgas();
if (gasState) {
	System.out.println("출발합니다.");
	car.run();
}//여기까지 실행했을떄 gas 필드값 0
System.out.println(car.gas);
if(car.isleftgas()) {
	System.out.println("gas를 주입할필요가 없습니다.");
}else {
	System.out.println("gas를 주입하세요");
}
	}

}
