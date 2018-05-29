package java_example_20180818;

public class arraycreartebyvaluelist_Exmple {
public static void main(String[] args) {
	//배열선언:int 타입의 scores라는 배열변수선언
	//int[] scores;
	int[] scores= {83,90,87}; //0=83 1=90 2 =87 배열의 총길이는 3(0~2)
	//배열값접근(출력)
	System.out.println("scroes[0]의 값"+scores[0]);
	System.out.println("scroes[1]의 값"+scores[1]);
	System.out.println("scroes[2]의 값"+scores[2]);
	//배열길이
	int length=scores.length;
	System.out.println("배열길이 length 변수값:"+length);
	//배열요스들의 합 구하기
	int sum=0;
	for(int i=0; i<scores.length; i++) {
		/*sum=scores[0]+scores[1]+scores[2];
		sum=sum+scores[0];
		sum=sum+scores[1];
		sum=sum+scores[2];*/
		sum=sum+scores[i];}
		System.out.println("총합"+sum);
		double avg=sum/scores.length;
		System.out.println("평균"+avg);
	System.out.println(length);
	
}
}
