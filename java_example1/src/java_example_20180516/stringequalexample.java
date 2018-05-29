package java_example_20180516;

public class stringequalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		String a="본인이쁨";
		String b="본인이쁨";
		String c=new String("본인이쁨");//새로운객체 
		System.out.println(a ==b); // t
		System.out.println(a ==c); //f 내용은같은데 원천이다름
		System.out.println();//
		System.out.println(a.equals("본인이쁨"));//t  ~.equals() 내용만비교할때 
		System.out.println(a.equals(c));//t
	}

}
