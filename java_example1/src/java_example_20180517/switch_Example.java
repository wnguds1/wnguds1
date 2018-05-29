package java_example_20180517;

public class switch_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1~6까지의 난수발생
		int num = (int)(Math.random()*6)+1;
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
		System.out.println("2번이 나왔습니다.");
		break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
		default:
			System.out.println("6번이 나왔씁니다.");
			break;
		}
	}

}
