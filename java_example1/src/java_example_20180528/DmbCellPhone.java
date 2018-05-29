package java_example_20180528;
//cellphone의 자식클래스 자식+extends 부모 클래스
public class DmbCellPhone extends cellphone {
//필드선언
	int channel;
	
	//생성자 선언
	DmbCellPhone(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	//메소드 선언
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 dmb방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
		
	}
	void turnOffDmb() {
		System.out.println("dmb방송 수신을 멈춥니다.");
		
	}
}
