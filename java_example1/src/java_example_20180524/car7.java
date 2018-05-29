package java_example_20180524;

public class car7 {
int speed=10;
//필드선언
String name;
//생성자 선언
car7(String model){//넘겨받은 매개변수값을 현재필드값에저장
	this.name=model;
}//메소드선언
void run(){
	 
		for(; speed<=50; speed+=10)	{
			/*int sp=speed*10;*/
		System.out.println(name+"가 달립니다.(시속:"+speed+"km/h)");

		
	}
}
}
