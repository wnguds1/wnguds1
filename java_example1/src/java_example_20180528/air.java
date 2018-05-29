package java_example_20180528;

public class air extends airplane{
//1의 값을 갖는 normal 상수 정의
	//2의 값을 값는 supersonic 상수 정의
	static final int normal =1;
	static final int supersonic =2;
	
	public int flyMode=normal;
	//fly 메소드 재정의
	@Override
	public void fly() {
		if(flyMode==supersonic) {
			System.out.println("초고속비행합니다.");
		}else//부모클래스 메소드 호출 
		{
			
			super.fly();
		
		}
			
			
	}
}
