package java_example_20180529;

public class car2 {
public String color;
public int speed;

public car2(String color, int speed) {
	this.color=color;
	this.speed=speed;
}
public void speedup(int speed) {
	this.speed = this.speed + speed;
	
}
public void speeddown() {
	this.speed = this.speed-speed;
	
}
}
