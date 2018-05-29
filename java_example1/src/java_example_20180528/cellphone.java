package java_example_20180528;
//부모 클래스 cellphone
public class cellphone {
//필드 선언
	String model;
	String color;
//메소드 선언
	void PowerOn() {
	System.out.println("전원을 켭니다.");
	}
	void PowerOff() {
	System.out.println("전원을 끕니다.");
	}
	void bell() {
	System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
	System.out.println("자기:"+message);
	}
	void receiveVoice(String message) {
	System.out.println("상대방:"+message);
	}
	void hangUp() {
	System.out.println("전화를 끊습니다.");
	}
}
