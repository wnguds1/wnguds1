package java_example_20180528;

public class computer_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int r=10;
calculator cal = new calculator();
System.out.println("부모클래스 메소드 호출"+cal.areaCircle(r));

calculator cal1 = new calculator();
System.out.println("자식클래스 메소드 호출"+cal1.areaCircle(r));
	}

}
