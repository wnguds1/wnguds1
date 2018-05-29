package java_example_20180529;

public class Main {
	public static void main(String[] args) {
	sedan sedan = new sedan("빨강",100);
	truck truck = new truck("검정",50,5);
sedan.speedup(100);
truck.speedup(50);
sedan.seatnum=5;
	System.out.println(sedan.color+"승용차 속도는"+sedan.speed+"이고"+"좌석수는"+sedan.seatnum+"입니다.");
	System.out.println(truck.color+"승용차 속도는"+truck.speed+"이고"+"적재량은"+truck.amount+"입니다.");

}
}
