package java_example_20180516;

public class logicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//and 연산 (&&) 둘다참일때 true
		//or 연산(||) 하나라도 참이면 true
	//not 연산(!) 1->0 0->1 
		int a='A';
		if((a>=65)&&(a<=90)) {
			System.out.println("대문자이군요");
		}
		if((a>=97)&&(a<=122)) {
			System.out.println("소문자이군요");
		}
		if(!(a<48)&&!(a>57)) {
			System.out.println("8~9이군요");
		} 
		int value=6;
		if((value%2==0)||(value%3==0)) {
			System.out.println("2또는3의배수 이군요");
		}
	}

}
