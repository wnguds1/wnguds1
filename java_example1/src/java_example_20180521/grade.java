package java_example_20180521;

import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run= true;
		int[] score = null;//배열 변수 선언
		int studentnum=0;// 학생수 
		Scanner scanner= new Scanner(System.in);
			
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("|1.학생수|"+"2.점수입력|"+"3.점수리스트|"+"4.분석|"+"5.종류|");
			System.out.println("----------------------------------------------------");
			System.out.println("선택>");
			int selectno=scanner.nextInt();
		if(selectno==1) {
			//학생수를 입력받아 입력받은 값만큼 배열크기설정
			System.out.println("학생수>");
			studentnum=scanner.nextInt();
			//score배열변수 만큼의 크기를 설정
			score=new int[studentnum];
		}else if(selectno==2) {
			//입력된 학생수 만큼의 점수를 입력하여 배열에 저장
	for(int i=0; i<score.length; i++) {
		System.out.println((i+1)+"번째의 학생의 점수:");
		score[i]=scanner.nextInt();
	}
		}else if(selectno==3) {
			//배열에 입력된 값 하나하나 출력
			for(int i=0; i<score.length; i++) {
				System.out.println((i+1)+"번째의 학생의 점수:"+score[i]);
			}
		}else if(selectno==4) {
			//배열에 입력된 값중 최고값 , 평균값을 계산하여 출력
			int max=0,sum=0;
			double avg=0;
			for(int i=0; i<score.length; i++) {
				max=(max<score[i])?score[i]:max;
				sum=sum+score[i];
						
			}avg=(double) sum/score.length;
			System.out.println("최고점수:"+max);
			System.out.println("평균점수"+avg);
		}else if(selectno==5) {
			run=false;
			System.out.println("종료");
		}
		
		
	}}}



