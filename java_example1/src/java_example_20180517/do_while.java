package java_example_20180517;
import java.util.Scanner;
public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);

System.out.println("메세지를입력하세요");
System.out.println("종류할려면q누르세요");
String enter ;
enter = scanner.next();


do {System.out.print(">");
	enter=scanner.next();
	System.out.println(enter);
	
}while(!enter.equals("q"));
System.out.println();
System.out.println("프로그램종료");
	
	
}
}
