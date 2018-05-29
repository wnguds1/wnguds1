package java_example_20180524;

public class getter_Setter_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
getter_setter car=new getter_setter();

//stter ㅇ를 후출하여 속도 값을 ㅅ러정
car.setSpeed(180);
System.out.println(car.getSpeed());
if(!car.isStop()) {
	car.setStop(true);
}
System.out.println(car.getSpeed());
	}

}
