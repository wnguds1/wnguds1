package java_example_20180516;

public class ch2_promotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
byte bytevalue=10;
int intvalue=bytevalue;
//byte 타입 변수가 int 타입으로 자동타입변환
System.out.println(intvalue);

char charvalue='가';
intvalue=charvalue;
//int 는 문자값을 가질수 없어서 '가'를 유니코드로 나옴
System.out.println("가의 유니코드="+intvalue);

intvalue =500;
long longvalue=intvalue;
System.out.println(longvalue);

intvalue=200;
double doublevalue=intvalue;
System.out.println(doublevalue);
//형변환 하면서 실수로바뀜
	}

}
