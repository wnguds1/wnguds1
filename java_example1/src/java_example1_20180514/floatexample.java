package java_example1_20180514;

public class floatexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

/*
 * 실수형 변수를 선언하는 타입 double(8byte), float(4byte)
 * 자바는 기본실수값을 double 타입으로 인지하기때문에 float 타입의 변수에 실수를 담기 위해서는
 * 값의 끝에 F를붙여여함
 * 
 */
double var1=3.14;
//int var2=3.14;
float var3=3.14F;

double var6=3E6;//3x10 6승
float var7=3e6F;
double var9=2e-3;//2x10 -3승


System.out.println("var1:"+"더연결하면"+var1);
System.out.println("var3:"+var3);
System.out.println("var6:"+var6);
System.out.println("var7:"+var7);
System.out.println("var9:"+var9);

	}
}

