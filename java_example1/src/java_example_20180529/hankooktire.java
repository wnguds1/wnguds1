package java_example_20180529;

public class hankooktire extends Tire{
public hankooktire(String location, int maxRotation) {
	super(location,maxRotation);
}
@Override
public boolean roll() {
	++accumulatedRotaion; // 1 
	if(accumulatedRotaion<maxRotaion) { // max 6.
		System.out.println(location+"hankookTire 수명:"+(maxRotaion-accumulatedRotaion)+"회");
		return true;
		
	}else {
		System.out.println("***"+location+"hankookTire 펑크***");
		return false;
	}
}
}
