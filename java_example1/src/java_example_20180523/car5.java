package java_example_20180523;
//method overloading
public class car5 {
	//정사각형의 넓이를 구하는 메소드
	//메소드 이름:areaRectangle
	//직사각형의 넓이를 구하는 메소드
	double x;
	double y;
double area(double x, double y) {
	this.x=x;
	this.y=y;
	double result=x*y;
	return result;
}
double area1(double x){
	this.x=x;
	double result1=x*x;
	return result1;
}
	
	void areaRectangle() {
	double result=area(x,y);
	double result1=area1(x);
	System.out.println("직사각형의 넓이:"+result);
	System.out.println("정사각형의 넓이:"+result1);

	}
}

//main클래스의 실행내용
/*
 * 객체 생성에서
 * 정사각형의 넓이 구하는 메소드 호출하고 결과출력
 * 정사각형의 넓이 구하는 메소드 호출하고 결과출력
 */
