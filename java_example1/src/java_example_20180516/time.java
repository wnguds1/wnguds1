package java_example_20180516;

import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner time= new Scanner(System.in);
		System.out.println("초를입력하세요");
		int sec=time.nextInt();
		int min=(sec%3600)/60;
		int hr=sec/3600;
		int sec1=(sec%3600)%60;
		
	   System.out.println(sec+"초는"+hr+"시간"+min+"분"+sec1+"초입니다.");
	   
	   
	}

}
