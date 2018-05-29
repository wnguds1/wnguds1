package java_example_20180521;

import java.util.Scanner;

public class dafadsasdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 문제 양수 5개를 입력 받아서 배열에 저장하고 입력 받은 수중 가장쿤 수를 출력하는 프로그램작성
 */
		Scanner scan= new Scanner(System.in);
		
		//최대값 감을 변수
		

		int[] score = new int[5];
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<score.length; i++) {
			score[i]=scan.nextInt();
			for(int j=0; j<score.length; i++)
			if(score[i]<score[j]) {
				
				int temp=score[i];
				score[i]=score[j];
				score[j]=temp;
			}
			System.out.println();
				
		}
		
	}

}
