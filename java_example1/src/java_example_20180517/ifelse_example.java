package java_example_20180517;

public class ifelse_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * score 변수값을 85로 선언
 * scroe가 90이상이면 90보다큽니다. 등급은 A입니다. 출력
 * 90이하면 90보다 작습니다. 등급은 B입니다.
 */
		int score=85;
		if(score>=90) {
			System.out.println("90보다큽니다.");
			System.out.println("등급은 A입니다.");
		}else { //스코어가 90이상이아닌모든것
			System.out.println("90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
