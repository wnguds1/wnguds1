package java_example_20180517;

public class break_exampl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
while(true) {
	int num=(int)(Math.random()*6)+1;
	System.out.println(num);
	if(num==6) {
		break;
	}
} System.out.println("반복문 종료됨");
	}

}
