package java_example_20180517;

public class char_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char grade ='B';
String position = "과장";
switch(position) {
case"부장":
	System.out.println("우수 회원입니다.");
	break;
case"과장":
	System.out.println("일반 회원입니다.");
	break;
	default:
		System.out.println("손님입니다.");
}
	}

}
