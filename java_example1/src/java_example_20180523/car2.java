package java_example_20180523;

public class car2 {
//field 선언
	String company="현대자동차";
	String model;
	String color;
	int maxspeed;
//여러 중복의 생성자 선언해보기
	//1. 기본 생성자
	//2. model 를 매개변수로 하는 생성자
	//3. model,color를 매개변수로 하는 생성자
	//4. model,color,maxspeed를 매개변수로 하는 생성자
	car2(){
		
	}
	
	
	/*car2(String m){
    model=m;
	}*/
	car2(String model){
	/*this.model=model;*/
	this(model,"은색",350);
	//현재클래스에 있는 string string int 생성자를 호출하여 출력
	}
	car2(String model,String color){
	this.model=model;
	this.color=color;
	}
	car2(String model,String color,int maxspeed){
		this.model=model;
		this.color=color;	
		this.maxspeed=maxspeed;
	}
}
