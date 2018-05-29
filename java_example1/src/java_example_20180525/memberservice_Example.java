package java_example_20180525;

import java.util.Scanner;

public class memberservice_Example {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
	while (true) {
		member m = new member();
		System.out.println("-------------------");
		System.out.println("수행할 서비스를 선택하세요");
		System.out.println("1.로그인   ||  2. 로그아웃");
		System.out.println(">>");
		int choice=scan.nextInt();
		switch(choice) {
		case 1:
			System.out.println("아이디를 입력하세요");
			m.id=scan1.nextLine();
			System.out.println("비밀번호를입력하세요");
		    m.password=scan1.nextInt();
		    boolean result =m.login(m.id,m.password);
		    if(result) {
		    	System.out.println("로그인되었습니다.");
		    	
		    }else {
		    	System.out.println("id또는 password 가 올바르지 않습니다.");
		    }break;
		case 2:
			m.logout("yourid");
			break;
		// TODO Auto-generated method stub
		
		}

	}

		}}
