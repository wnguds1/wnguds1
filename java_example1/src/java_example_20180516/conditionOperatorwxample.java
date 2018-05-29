package java_example_20180516;

public class conditionOperatorwxample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//삼항연사자 형식:(조건식)? 조건이 true일떄의 결과 조건이 false일때의 결과
		int a=85;
		char b= (a>90)? 'A':'B';
		/*
		 * if(a>90) {
		 * b = 'A';
		 * }else {
		 * b ='B';
		 * }
		 * */
		System.out.println("당신의 성적은"+a+"입니다");
	}

}
