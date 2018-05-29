package java_example_20180516;

public class ch2_operationPromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte bytevalue1=10;
byte bytevalue2=20;
//byte bytevalue3=bytevalue1+bytevalue2; 컴파일 에러
int intvalue1=bytevalue1+bytevalue2;
//int 연산자만 계산할수있음
System.out.println(intvalue1);

char charvalue1='A';
char charvalue2=1;
//char charvalue3=(char)(charvalue1+charvalue2);
int intvalue2=charvalue1+charvalue2;
System.out.println("유니코드="+intvalue2);
System.out.println("출력문자="+(char)intvalue2);

int intvalue3=10;
int intvalue4=intvalue3/4;
System.out.println(intvalue4);

int intvalue5=10;
double doublevalue=intvalue5/4.0;
// intvalue = 10.0 이됨
System.out.println(doublevalue);

	}

}
