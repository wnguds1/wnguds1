package java_example_20180521;

public class advanced_for_exmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//향상된 for 문
		int[] scores= {95,85,90,66,88};
		int sum=0;
		//for - each문 score 가 scores의 요소하나하나
		for(int score : scores) {
			sum=sum+score;
			System.out.println(score);
		} 
		System.out.println("점수총합"+sum);
	}

}
