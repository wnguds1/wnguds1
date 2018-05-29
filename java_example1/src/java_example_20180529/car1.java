package java_example_20180529;

public class car1 {
	//필드 각필드는 타이어 클래스 타입
	
Tire frontlefttire = new Tire("앞왼쪽",6);
Tire frontrighttire = new Tire("앞오른쪽",2);
Tire backlefttire = new Tire("뒤왼쪽",3);
Tire backrighttire = new Tire("뒤오른쪽",3);
//타이어클래스 타입의 배열변수
/*Tire[] tire = new Tire[100];
Tire[] tire1 = {};
Tire[] tire2 = {
		new Tire("앞왼쪽",6),
		new Tire("앞오른쪽",2),
		new Tire("뒤왼쪽",3),
		new Tire("뒤오른쪽",3)
};

Tire2[0] = new Tire("앞왼쪽",6);
Tire2[0] = new Tire("앞오른쪽",2);
Tire2[0] = new Tire("뒤왼쪽",3);
Tire2[0] = new Tire("뒤오른쪽",3);*/
int run() {
	System.out.println("[자동차가 달립니다.]");
	if(frontlefttire.roll()==false) {stop(); return 1;}
	if(frontrighttire.roll()==false) {stop(); return 1;}
	if( backlefttire.roll()==false) {stop(); return 1;}
	if( backrighttire.roll()==false) {stop(); return 1;}
	return 0;
}
void stop() {
	System.out.println("[자동차가 멈춥니다.]");
}
}

