package java_example_20180528;

public class studentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//student 클래스에 대한 객체 생성
		student student1 = new student("이름","123-456",10);
		
		//부모클래스 필드
		System.out.println(student1.name);
		System.out.println(student1.ssn);
		//자식클래스 ㅇ필드
		System.out.println(student1.studentNo);
	}

}
