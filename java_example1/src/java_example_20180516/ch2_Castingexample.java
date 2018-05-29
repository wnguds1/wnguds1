package java_example_20180516;

public class ch2_Castingexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int intvalue=44032;
//44032 '가"에 대한 유니코드
//char charvalue= intvalue; int타입이 char 타입보다크기가커서
char charvalue=(char) intvalue;
//강제 변환하는 문법
System.out.println(charvalue);

long longvalue=500;
intvalue= (int) longvalue;
System.out.println(longvalue);

double doublevalue=3.14;
intvalue=(int) doublevalue;
//강제로 바꿀땐 () 필요
System.out.println(intvalue);

	}

}
