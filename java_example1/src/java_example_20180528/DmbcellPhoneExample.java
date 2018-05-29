package java_example_20180528;

public class DmbcellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DmbCellPhone에 대한 객체 생성
		DmbCellPhone dmbcellphone = new DmbCellPhone("애플","실버",10);
				//생성한 객체의 model color channel 값을 각각출력
				//자식 클래스,부모클래에서 선언한 메소드 각각호출
		System.out.println("모델:"+dmbcellphone.model);
		System.out.println("색상:"+dmbcellphone.color);		
		System.out.println("채널:"+dmbcellphone.channel);
		
		dmbcellphone.PowerOn();
		dmbcellphone.PowerOff();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("안녕하세요.");
		dmbcellphone.receiveVoice("반갑습니다.");
		dmbcellphone.hangUp();
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDmb(3);
		dmbcellphone.turnOffDmb();
	}

}
