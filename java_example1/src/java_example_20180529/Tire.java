package java_example_20180529;

public class Tire {
public int maxRotaion;
public int accumulatedRotaion;
public String location;

public Tire(String location, int maxRotaion) {
	this.location=location;
	this.maxRotaion=maxRotaion;
}

public boolean roll() {
	++accumulatedRotaion;
	if(accumulatedRotaion<maxRotaion) {
		System.out.println(location+"Tire 수명:"+(maxRotaion-accumulatedRotaion)+"회");
		return true;
		
	}else {
		System.out.println("***"+location+"Tire 펑크***");
		return false;
	}
}
}
