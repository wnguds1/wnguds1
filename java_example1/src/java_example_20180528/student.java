package java_example_20180528;

public class student extends people {
public int studentNo;
student(String name, String ssn, int studentNo){
	//부모클래스의 해당 매개변수를 이용하는 생성자를 바로 호출
	super(name,ssn);
	this.studentNo=studentNo;
}
}
