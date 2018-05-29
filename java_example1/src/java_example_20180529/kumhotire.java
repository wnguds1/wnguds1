package java_example_20180529;

public class kumhotire extends Tire {
public kumhotire(String location, int maxRotation) {
	super(location,maxRotation);
}
@Override
public boolean roll() {
	++accumulatedRotaion;
	if(accumulatedRotaion<maxRotaion) {
		System.out.println(location+"kumhoTire 수명:"+(maxRotaion-accumulatedRotaion)+"회");
		return true;
		
	}else {
		System.out.println("***"+location+"kumhoTire 펑크***");
		return false;
	}
}
}