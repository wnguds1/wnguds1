package java_example_20180521;

public class arrayexample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2차원 배열을 사용하여 평정계산하기
		double score[][]= {{3.3, 3.4},{3.5, 3.8},{4.2, 4.3},{3.9, 4.0}
		};
		double sum=0.0;
		double avg=0.0;
		int count = 0;
		int length=score.length;
		for(int i=0; i<score.length; i++)//행의길이 4 
		{
			for(int j=0; j<score[i].length; j++) {
				System.out.println(score[i][j]);
		sum=sum+score[i][j];
		count++; //더한수 선언
			 avg=sum/count;
		} }
		System.out.println(avg);
		System.out.println(sum);
		
			
		
	}
}
