package java_example_20180517;
//중첩 for문을 이용한 구구단
public class formultipication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=2; i<=9; i++) {
	System.out.println(i+"단출력하기");
	
	for(int j=1; j<=9; j++) {
		System.out.print(i+"x"+j+"="+i*j);
		System.out.print("\t");
	
		
	}
	System.out.println();
}
	}

}
