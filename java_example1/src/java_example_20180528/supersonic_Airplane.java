package java_example_20180528;

public class supersonic_Airplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
air sa = new air();
sa.land();
sa.fly();
sa.takeoff();
sa.flyMode=air.supersonic;
sa.fly();
sa.flyMode=air.normal;
sa.fly();
sa.land();


	}

}
