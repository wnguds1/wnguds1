package java_example_20180516;

public class ch3_stringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string 긴문자 넣을수있음
String str1="jdk"+ 8.0;
String str2=str1+"특징";
System.out.println(str2);

String str3 = "jdk"+3+3.0; // jdk33.0
//+ 연결로 인식
String str4 =3+3.0+"jdk";//6.0 jdk
System.out.println(str3);
System.out.println(str4);
	}

}
